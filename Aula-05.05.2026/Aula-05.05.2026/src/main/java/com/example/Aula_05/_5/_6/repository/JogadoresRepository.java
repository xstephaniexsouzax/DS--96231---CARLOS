package com.example.Aula_05._5._6.repository;

import com.example.Aula_05._5._6.model.JogadoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JogadoresRepository extends JpaRepository<JogadoresModel, Long> {

    Optional<JogadoresRepository> findByNome(String nome);
}
