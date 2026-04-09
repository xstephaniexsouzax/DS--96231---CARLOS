package com.example.projeto.repository;

import com.example.projeto.model.ClienteModel;
import com.example.projeto.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {

    Optional<FuncionarioModel> findByEmail(String email);
}
