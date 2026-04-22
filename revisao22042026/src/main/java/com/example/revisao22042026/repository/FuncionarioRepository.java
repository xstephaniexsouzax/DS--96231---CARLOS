package com.example.revisao22042026.repository;

import com.example.revisao22042026.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    //Optional<FuncionarioModel> findByEmail(String email);
    Optional<FuncionarioModel>findByEmail(String email);
}
