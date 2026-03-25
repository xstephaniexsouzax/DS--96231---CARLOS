package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @GetMapping
    public class UsuarioController {
        private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioController usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
        
    }

    // consultar todos os usuarios
    @GetMapping
    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }

}
}