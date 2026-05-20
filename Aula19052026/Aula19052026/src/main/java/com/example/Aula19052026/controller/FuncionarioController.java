package com.example.Aula19052026.controller;

import com.example.Aula19052026.dto.funcionario.FuncionarioRequestDTO;
import com.example.Aula19052026.dto.funcionario.FuncionarioResponseDTO;
import com.example.Aula19052026.services.FuncionarioService;
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

    // listar
    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>>listarF(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarFuncionario());
    }

    //cadastrar

    @PostMapping
    public ResponseEntity<Map<String, Object>>salvarF(
            @Valid @RequestBody FuncionarioRequestDTO funcionarioRequestDTO){
        service.salvarFuncionario(funcionarioRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionario cadastrado com sucesso"));

    }

    //atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizarF(
            @PathVariable Long id,
            @Valid @RequestBody FuncionarioRequestDTO funcionarioRequestDTO){
        service.autualizaF(id, funcionarioRequestDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Funcionario atualizado com sucesso"));

    }

    //deletar

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletarF(@PathVariable Long id){
        service.deletarFuncionario(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Funcioanario deletado com sucesso"));
    }
}
