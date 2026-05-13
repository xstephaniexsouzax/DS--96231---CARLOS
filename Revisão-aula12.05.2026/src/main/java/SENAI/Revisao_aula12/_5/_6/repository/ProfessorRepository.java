package SENAI.Revisao_aula12._5._6.repository;

import SENAI.Revisao_aula12._5._6.model.Alunos;
import SENAI.Revisao_aula12._5._6.model.Professores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professores, Long> {
    Optional<Alunos> findByEmail(String email);
}
