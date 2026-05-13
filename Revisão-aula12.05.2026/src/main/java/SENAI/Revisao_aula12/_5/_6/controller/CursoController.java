package SENAI.Revisao_aula12._5._6.controller;

import SENAI.Revisao_aula12._5._6.dto.curso.CursoRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.curso.CursoResponseDTO;
import SENAI.Revisao_aula12._5._6.service.CursosServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursosServices services;

    // listar

    @GetMapping
    public ResponseEntity<List<CursoResponseDTO>>listarAluno(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(services.listarCurso());
    }

    // salvar curso
    @PostMapping

    public ResponseEntity<Map<String, Object>>salvarCurso(
            @Valid @RequestBody CursoRequestDTO cursoRequestDTO){
        services.salvarCurso(cursoRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Curso cadastrado com sucesso"));

    }
    // atualizar

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizarCurso(
            @PathVariable Long id,
            @Valid @RequestBody CursoRequestDTO cursoRequestDTO){
        services.atualizarCurso(id, cursoRequestDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Curso atualizado com sucesso"));
    }

    // deletar curso
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletarCurso(@PathVariable Long id){
        services.deletarCurso(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Curso deletado com sucesso"));
    }


}
