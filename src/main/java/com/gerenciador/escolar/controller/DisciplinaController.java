package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Disciplina;
import com.gerenciador.escolar.service.DisciplinaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {
    private final DisciplinaService disciplinaService;

    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Long id) {
        return disciplinaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Disciplina> buscarTodos() {
        return disciplinaService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        disciplinaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Disciplina disciplina) {
        disciplinaService.salvar(disciplina);
    }

    @PutMapping
    public void atualizar(@RequestBody  Disciplina disciplina) {
        disciplinaService.salvar(disciplina);
    }
}
