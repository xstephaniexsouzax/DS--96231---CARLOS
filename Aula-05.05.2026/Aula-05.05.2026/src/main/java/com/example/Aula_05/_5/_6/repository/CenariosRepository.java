package com.example.Aula_05._5._6.repository;

import com.example.Aula_05._5._6.model.CenariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CenariosRepository extends JpaRepository<CenariosModel, Long> {

    Optional<CenariosModel> findByClima(String clima);
}
