package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Professor;
import com.gerenciador.escolar.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    @GetMapping("/{id}")
    public Professor buscarUm(@PathVariable Long id) {
        return professorService.buscarUm(id);
    }

    @GetMapping
    public Collection<Professor> buscarTodos() {
        return professorService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        professorService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Professor professor) {
        professorService.salvar(professor);
    }

    @PutMapping
    public void atualizar(@RequestBody  Professor professor) {
        professorService.salvar(professor);
    }
}
