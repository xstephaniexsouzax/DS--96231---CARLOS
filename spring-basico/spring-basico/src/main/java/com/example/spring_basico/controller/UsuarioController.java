package com.example.spring_basico.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring_basico.models.UsuarioModel;
import com.example.spring_basico.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // consultar todos os usuarios
    @GetMapping
    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }
}