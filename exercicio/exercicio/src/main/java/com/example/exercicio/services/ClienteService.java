package com.example.exercicio.services;

import com.example.exercicio.model.ClienteModel;
import com.example.exercicio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel> ListarTodos(){
        return repository.findAll();
    }

    public ClienteModel salvarCliente(ClienteModel cliente) {
        if (repository.findByemail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado");
        }
        return repository.save(cliente);
    }
}