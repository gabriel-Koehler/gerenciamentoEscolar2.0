package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.model.Curso;
import com.gerenciador.escolar.service.AlunoService;
import com.gerenciador.escolar.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/curso")
public class CursoController {
    private final CursoService service;

    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Long id) {
        return service.buscarUm(id);
    }

    @GetMapping
    public Collection<Curso> buscarTodos() {
        return service.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Curso aluno) {
        service.salvar(aluno);
    }

    @PutMapping
    public void atualizar(@RequestBody  Curso aluno) {
        service.salvar(aluno);
    }
}
