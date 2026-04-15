package com.example.revisao.services;

import com.example.revisao.model.FuncionarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioRepository {
    @Autowired
    private com.example.revisao.repository.FuncionarioRepository repository;

    public List<FuncionarioModel> list() {
        return repository.findAll();
    }

    public FuncionarioModel save(FuncionarioModel funcionario) {
        if ((repository.findByEmail(funcionario.getEmail())).isPresent() {
            throw new RuntimeException(("Funcionário já está cadastrado"));

        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel model) {
        if (!repository.existsById(id)) {
            throw new IllegalAccessException("Funcionario não encontrado");
        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalAccessException("Funcionario não encontrado");

        }
        repository.deleteById(id);
    }
}
