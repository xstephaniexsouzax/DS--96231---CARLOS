package com.example.Aula_05._5._6.controller;

import com.example.Aula_05._5._6.dtoCenarios.CenarioRequestDTO;
import com.example.Aula_05._5._6.dtoCenarios.CenarioResponseDTO;
import com.example.Aula_05._5._6.services.CenarioServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/cenarios")
public class CenarioController {

    @Autowired
    private CenarioServices services;

    @GetMapping
    public ResponseEntity<List<CenarioResponseDTO>>listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(services.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>>salvar(
            @Valid @RequestBody CenarioRequestDTO cenarioRequestDTO){
        services.salvarCenario(cenarioRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mnesagem", "Cenário cadastrado com sucesso"));
    }

}
