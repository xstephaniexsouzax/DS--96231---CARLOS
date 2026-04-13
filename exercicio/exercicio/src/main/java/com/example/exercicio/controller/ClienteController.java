package com.example.exercicio.controller;

import com.example.exercicio.model.ClienteModel;
import com.example.exercicio.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> Listar(){
        return service.ListarTodos();
    }
    @PostMapping
    public ResponseEntity<Map<Object,String>> AddCliente(@RequestBody ClienteModel cliente){
        service.salvarCliente(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente cadastrado com sucesso"));
    }



}
