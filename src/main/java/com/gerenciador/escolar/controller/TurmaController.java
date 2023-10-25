package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Turma;
import com.gerenciador.escolar.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {
    private final TurmaService turmaService;

    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Long id) {
        return turmaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Turma> buscarTodos() {
        return turmaService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        turmaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Turma turma) {
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizar(@RequestBody  Turma turma) {
        turmaService.salvar(turma);
    }
}
