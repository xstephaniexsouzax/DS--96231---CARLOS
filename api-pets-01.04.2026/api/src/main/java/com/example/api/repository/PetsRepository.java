package com.example.api.repository;

import com.example.api.model.PetsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetsRepository extends JpaRepository<PetsModel, Long> {

}
