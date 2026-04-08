package com.example.api0704.controler;

import com.example.api0704.model.AlunosModel;
import com.example.api0704.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private AlunosRepository repository;

    @GetMapping
    public List<AlunosModel> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunosModel> salvar(@RequestBody AlunosModel alunos){

        repository.save(alunos);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunos);
    }
}
