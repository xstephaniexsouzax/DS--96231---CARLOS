package SENAI.Revisao_aula12._5._6.repository;

import SENAI.Revisao_aula12._5._6.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
    Optional<Cursos>findByNome(String nome);
}
