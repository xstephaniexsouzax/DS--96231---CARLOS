package com.example.Aula_05._5._6.services;

import com.example.Aula_05._5._6.dtoCenarios.CenarioResponseDTO;
import com.example.Aula_05._5._6.dtoJogadores.JogadoresResponseDTO;
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
    public List<JogadoresResponseDTO>ListarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new JogadoresResponseDTO(u.getNome(),u.getValorVelocidade()));
        

    }
}
