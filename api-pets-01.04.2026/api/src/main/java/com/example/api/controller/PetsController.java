package com.example.api.controller;

import com.example.api.model.PetsModel;
import com.example.api.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {

    @Autowired
    private PetsRepository repository;

    @GetMapping
    public List<PetsModel> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<PetsModel> salvar (@RequestBody PetsModel pets){
        repository.save(pets);
        return  ResponseEntity.status(HttpStatus.CREATED).body(pets);


    }
}
