package com.example.Aula_05._5._6.controller;


import com.example.Aula_05._5._6.dtoPersonagem.PersonagemRequestDTO;
import com.example.Aula_05._5._6.dtoPersonagem.PersonagemResponseDTO;
import com.example.Aula_05._5._6.services.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    @Autowired
    private PersonagemService service;

    @GetMapping
    public ResponseEntity<List<PersonagemResponseDTO>>listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>>salvar(
            @Valid @RequestBody PersonagemRequestDTO personagemRequestDTO){
                service.salvarPersonagem(personagemRequestDTO);
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(Map.of("Mensagem", "Personagem cadastrado com sucesso"));
    }

}
