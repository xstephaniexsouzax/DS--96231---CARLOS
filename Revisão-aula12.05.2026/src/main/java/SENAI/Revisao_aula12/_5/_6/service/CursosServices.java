package SENAI.Revisao_aula12._5._6.service;

import SENAI.Revisao_aula12._5._6.dto.curso.CursoRequestDTO;
import SENAI.Revisao_aula12._5._6.dto.curso.CursoResponseDTO;
import SENAI.Revisao_aula12._5._6.model.Cursos;
import SENAI.Revisao_aula12._5._6.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursosServices {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private CursosRepository repository;

    // listar cursos

    public List<CursoResponseDTO> listarCurso(){
        return repository
                .findAll()
                .stream()
                .map(u -> new CursoResponseDTO(u.getNome(), u.getNomeProfessor()))
                .toList();
    }

    // salvar curso

    public Cursos salvarCurso(CursoRequestDTO cursoRequestDTO){
        if (repository.findByNome(cursoRequestDTO.getNome()).isPresent()){
            throw new RuntimeException("o Curso já está cadastrado");
        }
        Cursos novoCurso = new Cursos();
        novoCurso.setNome(cursoRequestDTO.getNome());
        novoCurso.setDuracao(cursoRequestDTO.getDuracao());
        novoCurso.setCargaHoraria(cursoRequestDTO.getCargaHoraria());
        novoCurso.setNomeInstituicao(cursoRequestDTO.getNomeInstituicao());
        novoCurso.setNomeProfessor(cursoRequestDTO.getNomeProfessor());
        return repository.save(novoCurso);
    }

    //atualizar curso

    public Cursos atualizarCurso(Long id, CursoRequestDTO cursoRequestDTO){
        Cursos cursosExiste = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso não encotrado atravez do ID"));
        cursosExiste.setNome(cursoRequestDTO.getNome());
        cursosExiste.setNomeProfessor(cursoRequestDTO.getNomeProfessor());
        cursosExiste.setDuracao(cursoRequestDTO.getDuracao());
        cursosExiste.setNomeInstituicao(cursoRequestDTO.getNomeInstituicao());
        cursosExiste.setCargaHoraria(cursosExiste.getCargaHoraria());
        return repository.save(cursosExiste);
    }

    // deletar aluno

    public void deletarCurso(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar pelo nº do ID");
        }
        repository.deleteById(id);
    }
}
