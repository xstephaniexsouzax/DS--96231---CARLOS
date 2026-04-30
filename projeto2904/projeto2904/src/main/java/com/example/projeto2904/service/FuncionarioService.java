package com.example.projeto2904.service;


import com.example.projeto2904.dto.FuncionarioRequestDTO;
import com.example.projeto2904.dto.FuncionarioResponseDTO;
import com.example.projeto2904.model.FuncionarioModel;
import com.example.projeto2904.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDTO>listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new FuncionarioResponseDTO(u.getNome(),u.getEmail()))
                .toList();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioRequestDTO funcionarioRequestDTO){
        if (repository.findByEmail(funcionarioRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("Usuário já cadastrado");
        }
        FuncionarioModel novoFuncionario = new FuncionarioModel();
        novoFuncionario.setNome(funcionarioRequestDTO.getNome());
        novoFuncionario.setEmail(funcionarioRequestDTO.getEmail());
        novoFuncionario.setSenha(passwordEncoder.encode(funcionarioRequestDTO.getSenha()));
        return repository.save(novoFuncionario);

    }
}
