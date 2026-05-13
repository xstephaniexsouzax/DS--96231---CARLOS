package SENAI.Revisao_aula12._5._6.controller;


import SENAI.Revisao_aula12._5._6.dto.professor.ProfessorRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.professor.ProfessorResponseDTO;
import SENAI.Revisao_aula12._5._6.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/professores")

public class ProfessorController {
    @Autowired
    private ProfessorService service;

    //listar
    @GetMapping
    public ResponseEntity<List<ProfessorResponseDTO>> listarProfessor(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarProfessor());
    }

    //salvar

    @PostMapping
    public ResponseEntity<Map<String, Object>>salvarProfessor(
            @Valid @RequestBody ProfessorRequestDTO professorRequestDTO){
        service.salvarProfessor(professorRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Professor cadastrado com sucesso"));

    }

    //atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizarProfessor(
            @PathVariable Long id,
            @Valid @RequestBody ProfessorRequestDTO professorRequestDTO){
        service.autualizaProfessor(id, professorRequestDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Aluno atualizado com sucesso"));

    }

    //deletar

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletar(@PathVariable Long id){
        service.deletarProfessor(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Professor deletado com sucesso"));
    }
}
