package com.example.Aula_05._5._6.services;

import com.example.Aula_05._5._6.dtoCenarios.CenarioRequestDTO;
import com.example.Aula_05._5._6.dtoCenarios.CenarioResponseDTO;
import com.example.Aula_05._5._6.model.CenariosModel;
import com.example.Aula_05._5._6.repository.CenariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenarioServices {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private CenariosRepository repository;

    //listar cenario
    public List<CenarioResponseDTO>listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new CenarioResponseDTO(u.getClima(),u.getCultura()))
                .toList();
    }

    //salvar cenario
    public CenariosModel salvarCenario(CenarioRequestDTO cenarioRequestDTO){
        if (repository.findByClima(cenarioRequestDTO.getClima()).isPresent()){
            throw new RuntimeException("Cenário já cadastrado");
        }

        CenariosModel novoCenario = new CenariosModel();
        novoCenario.setClima(cenarioRequestDTO.getClima());
        novoCenario.setCultura(cenarioRequestDTO.getCultura());
        return repository.save(novoCenario);
    }

    //atualizar o cenário
    public CenariosModel atualizarCenario(Long id, CenarioRequestDTO cenarioRequestDTO){
        CenariosModel cenarioExiste = repository.findById(id)
                // 1. Busca pelo ID para garantir que estamos alterando o cenário correto
                .orElseThrow(() -> new RuntimeException(("Cenário não encontrado com o ID" + id)));
                // 2. Atualiza os dados da entidade existente com os dados novos do DTO
                cenarioExiste.setClima(cenarioRequestDTO.getClima());
                cenarioExiste.setClima(cenarioRequestDTO.getClima());
                // 3. Salva a alteração no banco de dados
        return repository.save(cenarioExiste);

    }
    // deletar cenario
    public void deletarCenario (Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar o ID");
        }
        repository.deleteById(id);
    }
}
