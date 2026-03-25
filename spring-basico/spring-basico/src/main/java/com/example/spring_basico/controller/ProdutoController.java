package com.example.spring_basico.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.example.spring_basico.models.ProdutoModel;
import com.example.spring_basico.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<ProdutoModel> listarTodos() {
        return produtoRepository.findAll();
    }
    
    @PostMapping
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }
}

