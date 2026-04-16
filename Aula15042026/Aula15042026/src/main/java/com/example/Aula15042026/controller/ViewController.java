package com.example.Aula15042026.controller;

import com.example.Aula15042026.model.FuncionarioModel;
import com.example.Aula15042026.service.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paginas")
public class ViewController {

    @Autowired
    private FuncionarioServices services;

    // Lista todos e prepara um objeto vazio para o formulário de cadastro
    @GetMapping
    public String index(Model model) {
        model.addAttribute("lista", services.list());
        model.addAttribute("funcionario", new FuncionarioModel());
        return "index";
    }

    // Salva ou Atualiza (O JPA decide pelo ID)
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute FuncionarioModel funcionario) {
        if (funcionario.getId() != null) {
            services.atualizarFuncionario(funcionario.getId(), funcionario);
        } else {
            services.save(funcionario);
        }
        return "redirect:/paginas"; // Recarrega a página para mostrar as mudanças
    }

    // Preenche o formulário com os dados de um funcionário existente
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        // Aqui o ideal seria um findById, mas para o teste:
        FuncionarioModel f = services.list().stream()
                .filter(func -> func.getId().equals(id))
                .findFirst().orElse(new FuncionarioModel());

        model.addAttribute("funcionario", f);
        model.addAttribute("lista", services.list());
        return "index";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        services.excluir(id);
        return "redirect:/paginas";
    }
}