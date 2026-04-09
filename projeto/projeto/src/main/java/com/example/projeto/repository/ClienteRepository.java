package com.example.projeto.repository;

import com.example.projeto.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository <ClienteModel, Long>{
    //consulta no banco de dados se o email existe antes de salvar um cliente

    Optional<ClienteModel> findByEmail(String email);
}
