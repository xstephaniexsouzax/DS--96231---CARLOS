package com.example.api.repository;


import com.example.api.controller.FuncionarioController;
import com.example.api.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {



}
