package com.example.Aula19052026.controller;

import com.example.Aula19052026.dto.cliente.ClienteRequestDTO;
import com.example.Aula19052026.dto.cliente.ClienteResponseDTO;
import com.example.Aula19052026.dto.funcionario.FuncionarioRequestDTO;
import com.example.Aula19052026.dto.funcionario.FuncionarioResponseDTO;
import com.example.Aula19052026.services.ClienteService;
import com.example.Aula19052026.services.FuncionarioService;
import jakarta.validation.Valid;
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

    // listar
    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listarC(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarC());
    }

    //cadastrar

    @PostMapping
    public ResponseEntity<Map<String, Object>>salvarC(
            @Valid @RequestBody ClienteRequestDTO clienteRequestDTO){
        service.salvarC(clienteRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente cadastrado com sucesso"));

    }

    //atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizarC(
            @PathVariable Long id,
            @Valid @RequestBody ClienteRequestDTO clienteRequestDTO){
        service.autualizaC(id, clienteRequestDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cliente atualizado com sucesso"));

    }

    //deletar

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletarF(@PathVariable Long id){
        service.deletarC(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Cliente deletado com sucesso"));
    }
}
