package com.example.projeto2904.controller;


import com.example.projeto2904.dto.FuncionarioRequestDTO;
import com.example.projeto2904.dto.FuncionarioResponseDTO;
import com.example.projeto2904.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>>listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(
            @Valid @RequestBody FuncionarioRequestDTO funcionarioRequestDTODTO) {
        service.salvarFuncionario(funcionarioRequestDTODTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionario cadastrado com sucesso."));
    }


}
