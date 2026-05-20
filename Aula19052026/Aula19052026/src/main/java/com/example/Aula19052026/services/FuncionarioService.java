package com.example.Aula19052026.services;

import com.example.Aula19052026.dto.funcionario.FuncionarioRequestDTO;
import com.example.Aula19052026.dto.funcionario.FuncionarioResponseDTO;
import com.example.Aula19052026.model.FuncionarioModel;
import com.example.Aula19052026.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private FuncionarioRepository repository;

    //Listar Fucionario
    public List<FuncionarioResponseDTO>listarFuncionario(){
        return repository
                .findAll()
                .stream()
                .map(u -> new FuncionarioResponseDTO(u.getNome(), u.getMatricula()))
                .toList();
    }

    // salvar funcionario

    public FuncionarioModel salvarFuncionario(FuncionarioRequestDTO funcionarioRequestDTO){
        if (repository.findByEmail(funcionarioRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("O funcionario já está cadastrado");
        }
        FuncionarioModel novoF = new FuncionarioModel();
        novoF.setNome(funcionarioRequestDTO.getNome());
        novoF.setMatricula(funcionarioRequestDTO.getMatricula());
        novoF.setEmail(funcionarioRequestDTO.getEmail());
        novoF.setDataNascimento(funcionarioRequestDTO.getDataNascimento());
        novoF.setSalario(funcionarioRequestDTO.getSalario());
        novoF.setEndereco(funcionarioRequestDTO.getEndereco());
        return repository.save(novoF);

    }

    // atualizar Funcionario

    public FuncionarioModel autualizaF(Long id, FuncionarioRequestDTO funcionarioRequestDTO){
        FuncionarioModel fExiste = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não entrado atravez d ID"));
        fExiste.setNome(funcionarioRequestDTO.getNome());
        fExiste.setMatricula(funcionarioRequestDTO.getMatricula());
        fExiste.setEmail(funcionarioRequestDTO.getEmail());
        fExiste.setDataNascimento(funcionarioRequestDTO.getDataNascimento());
        fExiste.setSalario(funcionarioRequestDTO.getSalario());
        fExiste.setEndereco(funcionarioRequestDTO.getEndereco());
        return repository.save(fExiste);
    }

    //deletarFuncionario

    public void deletarFuncionario(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar pelo nº do ID");
        }
        repository.deleteById(id);
    }
}
