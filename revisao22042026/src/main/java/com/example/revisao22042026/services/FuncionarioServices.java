package com.example.revisao22042026.services;

import com.example.revisao22042026.model.FuncionarioModel;
import com.example.revisao22042026.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {
    @Autowired
    private FuncionarioRepository repository;

    //Listar
    public List<FuncionarioModel>ListarFuncionarios(){
        return repository.findAll();
    }

    //Adicionar

    public FuncionarioModel adcionarAluno (FuncionarioModel funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Já existe um Funcionário cadastrado com esse e-mail");
        }
        return repository.save(funcionario);
    }

    public FuncionarioModel AtualizarFuncionario (Long id, FuncionarioModel funcionarioModel){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Aluno não encontrado!");
        }
        funcionarioModel.setId(id);
        return repository.save(funcionarioModel);
    }

    public void excluir (Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Aluno não encontrado");
        }
        repository.deleteById(id);
    }



}
