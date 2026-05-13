package SENAI.Revisao_aula12._5._6.service;

import SENAI.Revisao_aula12._5._6.dto.aluno.AlunoRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.aluno.AlunoResponseDTO;
import SENAI.Revisao_aula12._5._6.dto.professor.ProfessorRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.professor.ProfessorResponseDTO;
import SENAI.Revisao_aula12._5._6.model.Alunos;
import SENAI.Revisao_aula12._5._6.model.Professores;
import SENAI.Revisao_aula12._5._6.repository.AlunoRepository;
import SENAI.Revisao_aula12._5._6.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class ProfessorService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private ProfessorRepository repository;

    // listar professor

    public List<ProfessorResponseDTO> listarProfessor(){
        return repository
                .findAll()
                .stream()
                .map(u -> new ProfessorResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }

    // salvar professor

    public Professores salvarProfessor (ProfessorRequestDTO professorRequestDTO){
        if (repository.findByEmail(professorRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("O professor já está cadastrado");
        }
        Professores novoProfessor = new Professores();
        novoProfessor.setNome(professorRequestDTO.getNome());
        novoProfessor.setEmail(professorRequestDTO.getEmail());
        novoProfessor.setMateria(professorRequestDTO.getMateria());
        novoProfessor.setEndereco(professorRequestDTO.getEndereco());
        novoProfessor.setIdade(professorRequestDTO.getIdade());
        return repository.save(novoProfessor);
    }

    //atualizar professor

    public Professores autualizaProfessor(Long id, ProfessorRequestDTO professorRequestDTO){
        Professores professoreExiste = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não entrado atravez d ID"));
        professoreExiste.setNome(professorRequestDTO.getNome());
        professoreExiste.setEmail(professorRequestDTO.getEmail());
        professoreExiste.setMateria(professorRequestDTO.getMateria());
        professoreExiste.setEndereco(professorRequestDTO.getEndereco());
        professoreExiste.setIdade(professorRequestDTO.getIdade());
        return repository.save(professoreExiste);
    }

    // deletar professor

    public void deletarProfessor(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar pelo nº do ID");
        }
        repository.deleteById(id);
    }
}
