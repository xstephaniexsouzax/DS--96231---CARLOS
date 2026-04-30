package com.example.projeto2904.repository;

import com.example.projeto2904.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long>{
    Optional<FuncionarioModel> findByEmail(String email);
}
