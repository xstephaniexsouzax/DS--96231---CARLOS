package com.example.api0704.repository;

import com.example.api0704.model.AlunosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository <AlunosModel, Long> {
}
