package com.example.Aula_05._5._6.repository;

import com.example.Aula_05._5._6.model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {

    Optional<PersonagemModel> findByNome(String nome);
}
