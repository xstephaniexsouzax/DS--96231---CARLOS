package com.example.revisao22042026.controller;

import com.example.revisao22042026.model.FuncionarioModel;
import com.example.revisao22042026.services.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioServices services;

    @GetMapping
    public List<FuncionarioModel> ListarFuncionario(){
        return services.ListarFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> AdcionarFuncionerio (@RequestBody FuncionarioModel funcionarioModel){
        services.adcionarAluno(funcionarioModel);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionario cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> AtualizarFuncionario(
            @PathVariable Long id,
            @RequestBody FuncionarioModel funcionarioModel){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem","Funcionario atualizado com sucessi"));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> DeletarFuncionario(@PathVariable Long id){

        services.excluir(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem","Funcionario excluido com sucesso"));


    }
    }
















