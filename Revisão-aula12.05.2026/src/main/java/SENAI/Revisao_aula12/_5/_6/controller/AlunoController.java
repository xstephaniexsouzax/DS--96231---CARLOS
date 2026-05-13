package SENAI.Revisao_aula12._5._6.controller;

import SENAI.Revisao_aula12._5._6.dto.aluno.AlunoRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.aluno.AlunoResponseDTO;
import SENAI.Revisao_aula12._5._6.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService service;

    //listar
    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>>listarAluno(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarAluno());
    }

    //salvar

    @PostMapping
    public ResponseEntity<Map<String, Object>>salvarAluno(
            @Valid @RequestBody AlunoRequestDTO alunoRequestDTO){
        service.salvarAluno(alunoRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Aluno cadastrado com sucesso"));

    }

    //atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizarAluno(
            @PathVariable Long id,
            @Valid @RequestBody AlunoRequestDTO alunoRequestDTO){
        service.autualizaAluno(id, alunoRequestDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Alunos atualizado com sucesso"));

    }

    //deletar

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletar(@PathVariable Long id){
        service.deletarAluno(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Aluno deletado com sucesso"));
    }
}

