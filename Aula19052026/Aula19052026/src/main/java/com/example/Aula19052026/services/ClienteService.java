package com.example.Aula19052026.services;

import com.example.Aula19052026.dto.cliente.ClienteRequestDTO;
import com.example.Aula19052026.dto.cliente.ClienteResponseDTO;
import com.example.Aula19052026.model.ClienteModel;
import com.example.Aula19052026.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private ClienteRepository repository;

    //Listar Cliente
    public List<ClienteResponseDTO> listarC(){
        return repository
                .findAll()
                .stream()
                .map(u -> new ClienteResponseDTO(u.getNome(), u.getEmail()))
                .toList();
    }

    // salvar funcionario

    public ClienteModel salvarC (ClienteRequestDTO clienteRequestDTO){
        if (repository.findByEmail(clienteRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("O Cliente já está cadastrado");
        }
        ClienteModel novoC = new ClienteModel();
        novoC.setNome(clienteRequestDTO.getNome());
        novoC.setEmail(clienteRequestDTO.getEmail());
        novoC.setEndereco(clienteRequestDTO.getEndereco());
        return repository.save(novoC);

    }

    // atualizar Funcionario

    public ClienteModel autualizaC(Long id, ClienteRequestDTO clienteRequestDTO){
        ClienteModel cExiste = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não entrado atravez d ID"));
        cExiste.setNome(clienteRequestDTO.getNome());
        cExiste.setEmail(clienteRequestDTO.getEmail());
        cExiste.setEndereco(clienteRequestDTO.getEndereco());
        return repository.save(cExiste);
    }

    //deletarFuncionario

    public void deletarC(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Não foi possível localizar pelo nº do ID");
        }
        repository.deleteById(id);
    }
}
