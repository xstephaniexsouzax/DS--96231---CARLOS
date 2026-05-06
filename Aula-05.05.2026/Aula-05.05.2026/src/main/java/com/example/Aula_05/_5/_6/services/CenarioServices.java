package com.example.Aula_05._5._6.services;

import com.example.Aula_05._5._6.dtoCenarios.CenarioRequestDTO;
import com.example.Aula_05._5._6.dtoCenarios.CenarioResponseDTO;
import com.example.Aula_05._5._6.model.CenariosModel;
import com.example.Aula_05._5._6.repository.CenariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenarioServices {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private CenariosRepository repository;

    public List<CenarioResponseDTO>listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(u -> new CenarioResponseDTO(u.getClima(),u.getCultura()))
                .toList();
    }
    public CenariosModel salvarCenario(CenarioRequestDTO cenarioRequestDTO){
        if (repository.findByClima(cenarioRequestDTO.getClima()).isPresent()){
            throw new RuntimeException("Cenário já cadastrado");
        }

        CenariosModel novoCenario = new CenariosModel();
        novoCenario.setClima(cenarioRequestDTO.getClima());
        novoCenario.setCultura(cenarioRequestDTO.getCultura());
        return repository.save(novoCenario);
    }
}
