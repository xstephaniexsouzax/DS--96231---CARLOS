package com.example.Aula15042026.service;

import com.example.Aula15042026.model.FuncionarioModel;
import com.example.Aula15042026.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> list(){
        return repository.findAll();
    }

    public FuncionarioModel save(FuncionarioModel funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException(("Funcionario já cadastrado"));


        }
        return repository.save(funcionario);
    }


    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel model){
        if (!repository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");


        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Funcionario não encontrado");
        }
        repository.deleteById(id);
    }
}
