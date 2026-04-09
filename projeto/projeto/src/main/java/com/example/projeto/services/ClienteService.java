package com.example.projeto.services;

import com.example.projeto.model.ClienteModel;
import com.example.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel> listarTodos(){
        return repository.findAll();
    }
    public ClienteModel salvarCliente(ClienteModel cliente){
        if (repository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("cliente já cadastrado");

        }
        return repository.save(cliente);

    }
}
