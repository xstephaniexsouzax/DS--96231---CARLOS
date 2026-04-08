package com.example.api0704.repository;

import com.example.api0704.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {
}
