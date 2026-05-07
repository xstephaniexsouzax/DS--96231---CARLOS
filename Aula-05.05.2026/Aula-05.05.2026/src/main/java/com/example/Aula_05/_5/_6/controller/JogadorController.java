package com.example.Aula_05._5._6.controller;

import com.example.Aula_05._5._6.dtoCenarios.CenarioRequestDTO;
import com.example.Aula_05._5._6.dtoCenarios.CenarioResponseDTO;
import com.example.Aula_05._5._6.dtoJogadores.JogadoresRequestDTO;
import com.example.Aula_05._5._6.dtoJogadores.JogadoresResponseDTO;
import com.example.Aula_05._5._6.services.CenarioServices;
import com.example.Aula_05._5._6.services.JogadoresServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadoresServices services;

    //listar
    @GetMapping
    public ResponseEntity<List<JogadoresResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(services.listarTodos());
    }

    //salvar
    @PostMapping
    public ResponseEntity<Map<String, Object>>salvar(
            @Valid @RequestBody JogadoresRequestDTO jogadoresRequestDTO){
        services.salvarJogador(jogadoresRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mnesagem", "Jogador cadastrado com sucesso"));
    }

    //atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>>atualizar(
            @PathVariable Long id,
            @Valid @RequestBody JogadoresRequestDTO jogadoresRequestDTO){
        services.atualizarJogador(id, jogadoresRequestDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem","Jogador aualizado com sucesso"));
    }

    //deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>>deletar(@PathVariable Long id){
        services.deletarJogadir(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem", "Jogador deletado com sucesso"));
    }

}
