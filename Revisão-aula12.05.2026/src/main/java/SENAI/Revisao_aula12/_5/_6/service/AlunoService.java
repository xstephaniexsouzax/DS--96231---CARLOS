package SENAI.Revisao_aula12._5._6.service;


import SENAI.Revisao_aula12._5._6.dto.aluno.AlunoRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.aluno.AlunoResponseDTO;
import SENAI.Revisao_aula12._5._6.model.Alunos;
import SENAI.Revisao_aula12._5._6.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AlunoRepository repository;

    // listar aluno

    public List<AlunoResponseDTO>listarAluno(){
        return repository
                .findAll()
                .stream()
                .map(u -> new AlunoResponseDTO(u.getNome(), u.getCursos()))
                .toList();
    }

    // salvar aluno

    public Alunos salvarAluno (AlunoRequestDTO alunoRequestDTO){
        if (repository.findByEmail(alunoRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("O aluno já está cadastrado");
        }
        Alunos novoAluno = new Alunos();
        novoAluno.setNome(alunoRequestDTO.getNome());
        novoAluno.setEmail(alunoRequestDTO.getEmail());
        novoAluno.setCursos(alunoRequestDTO.getCursos());
        novoAluno.setDuracaoCurso(alunoRequestDTO.getDuracaoCurso());
        novoAluno.setNomeInstituicao(alunoRequestDTO.getNomeInstituicao());
        return repository.save(novoAluno);
    }

    //atualizar aluno

    public Alunos autualizaAluno(Long id, AlunoRequestDTO alunoRequestDTO){
        Alunos alunoExiste = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não entrado atravez d ID"));
                alunoExiste.setNome(alunoRequestDTO.getNome());
                alunoExiste.setEmail(alunoRequestDTO.getEmail());
                alunoExiste.setCursos(alunoRequestDTO.getCursos());
                alunoExiste.setDuracaoCurso(alunoRequestDTO.getDuracaoCurso());
                alunoExiste.setNomeInstituicao(alunoRequestDTO.getNomeInstituicao());
                return repository.save(alunoExiste);
    }

    // deletar aluno

    public void deletarAluno(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar pelo nº do ID");
        }
        repository.deleteById(id);
    }
}
