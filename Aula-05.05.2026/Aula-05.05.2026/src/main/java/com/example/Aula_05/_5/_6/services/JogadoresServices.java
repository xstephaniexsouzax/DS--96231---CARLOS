package com.example.Aula_05._5._6.services;

import com.example.Aula_05._5._6.dtoCenarios.CenarioResponseDTO;
import com.example.Aula_05._5._6.dtoJogadores.JogadoresRequestDTO;
import com.example.Aula_05._5._6.dtoJogadores.JogadoresResponseDTO;
import com.example.Aula_05._5._6.model.JogadoresModel;
import com.example.Aula_05._5._6.repository.CenariosRepository;
import com.example.Aula_05._5._6.repository.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class JogadoresServices {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JogadoresRepository repository;

    //listar Jogadores

    public List<JogadoresResponseDTO>listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new JogadoresResponseDTO(u.getNome(), u.getValorVelocidade(),u.getAgilidade()))
                .toList();
    }

    //salvar jogador

    public JogadoresModel salvarJogador (JogadoresRequestDTO jogadoresRequestDTO){
        if(repository.findByNome(jogadoresRequestDTO.getNome()).isPresent()){
            throw new RuntimeException("Jogador já cadastrado");
        }
        JogadoresModel novoJogador =  new JogadoresModel();
        novoJogador.setNome(jogadoresRequestDTO.getNome());
        novoJogador.setValorVelocidade(jogadoresRequestDTO.getValorVelocidade());
        novoJogador.setAgilidade(jogadoresRequestDTO.getAgilidade());
        return repository.save(novoJogador);

    }
    // atualizar jogador

    public JogadoresModel atualizarJogador(Long id, JogadoresRequestDTO jogadoresRequestDTO){
        JogadoresModel jogadoresModel = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
                jogadoresModel.setNome(jogadoresRequestDTO.getNome());
                jogadoresModel.setValorVelocidade(jogadoresRequestDTO.getValorVelocidade());

        return repository.save(jogadoresModel);
    }

    //deletar jogador

    public void deletarJogadir (Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Nao foi possível localizar pelo ID");
        }
        repository.deleteById(id);
    }

}
