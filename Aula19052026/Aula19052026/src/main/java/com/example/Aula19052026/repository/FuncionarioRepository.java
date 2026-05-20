package com.example.Aula19052026.repository;

import com.example.Aula19052026.model.ClienteModel;
import com.example.Aula19052026.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {

    Optional<FuncionarioModel> findByEmail(String email);
}
