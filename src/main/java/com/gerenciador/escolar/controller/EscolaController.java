package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Disciplina;
import com.gerenciador.escolar.model.Escola;
import com.gerenciador.escolar.service.DisciplinaService;
import com.gerenciador.escolar.service.EnderecoService;
import com.gerenciador.escolar.service.EscolaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/escola")
public class EscolaController {
    private final EscolaService service;

    @GetMapping("/{id}")
    public Escola buscarUm(@PathVariable Long id) {
        return service.buscarUm(id);
    }

    @GetMapping
    public Collection<Escola> buscarTodos() {
        return service.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Escola disciplina) {
        service.salvar(disciplina);
    }

    @PutMapping
    public void atualizar(@RequestBody Escola disciplina) {
        service.salvar(disciplina);
    }

}
