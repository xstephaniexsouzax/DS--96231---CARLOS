package com.example.exercicio.repository;

import com.example.exercicio.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
Optional<ClienteModel> findById(String email);

    Optional<ClienteModel> findByemail(String email);
}
