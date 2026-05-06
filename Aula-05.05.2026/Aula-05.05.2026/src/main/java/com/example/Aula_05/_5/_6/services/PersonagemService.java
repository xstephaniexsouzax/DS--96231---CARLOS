package com.example.Aula_05._5._6.services;

import com.example.Aula_05._5._6.dtoPersonagem.PersonagemRequestDTO;
import com.example.Aula_05._5._6.dtoPersonagem.PersonagemResponseDTO;
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


}
