package com.example.Aula_05._5._6.services;

import com.example.Aula_05._5._6.dtoCenarios.CenarioRequestDTO;
import com.example.Aula_05._5._6.dtoPersonagem.PersonagemRequestDTO;
import com.example.Aula_05._5._6.dtoPersonagem.PersonagemResponseDTO;
import com.example.Aula_05._5._6.model.CenariosModel;
import com.example.Aula_05._5._6.model.PersonagemModel;
import com.example.Aula_05._5._6.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private PersonagemRepository repository;

    public List<PersonagemResponseDTO>listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new PersonagemResponseDTO(u.getNome(),u.getCorDosOlhos()))
                .toList();
    }

    public PersonagemModel salvarPersonagem (PersonagemRequestDTO personagemRequestDTO){
        if (repository.findByNome(personagemRequestDTO.getNome()).isPresent()){
            throw new RuntimeException("Personagem ja cadastrado");
        }
        PersonagemModel novoPersonagem = new PersonagemModel();
        novoPersonagem.setNome(personagemRequestDTO.getNome());
        novoPersonagem.setAltura(personagemRequestDTO.getAltura());
        novoPersonagem.setCorDosOlhos(personagemRequestDTO.getCorDosOlhos());
        return repository.save(novoPersonagem);
    }
    //atualizar o personagem
    public PersonagemModel atualizarPersonagem(Long id, PersonagemRequestDTO personagemRequestDTO){
        PersonagemModel personagemModel = repository.findById(id)
                // 1. Busca pelo ID para garantir que estamos alterando o cenário correto
                .orElseThrow(() -> new RuntimeException(("Personagem não encontrado com o ID" + id)));
        // 2. Atualiza os dados da entidade existente com os dados novos do DTO
        personagemModel.setNome(personagemRequestDTO.getNome());
        personagemModel.setAltura(personagemRequestDTO.getAltura());
        personagemModel.setCorDosOlhos(personagemRequestDTO.getCorDosOlhos());
        // 3. Salva a alteração no banco de dados
        return repository.save(personagemModel);

    }
    // deletar cenario
    public void deletarPersonagem (Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar o ID");
        }
        repository.deleteById(id);
    }

}
