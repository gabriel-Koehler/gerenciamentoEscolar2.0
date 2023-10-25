package com.gerenciador.escolar.controller;

import com.gerenciador.escolar.model.Diretor;
import com.gerenciador.escolar.service.DiretorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/diretor")
public class DiretorController {
    private final DiretorService diretorService;

    @GetMapping("/{id}")
    public Diretor buscarUm(@PathVariable Long id) {
        return diretorService.buscarUm(id);
    }

    @GetMapping
    public Collection<Diretor> buscarTodos() {
        return diretorService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        diretorService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Diretor diretor) {
        diretorService.salvar(diretor);
    }

    @PutMapping
    public void atualizar(@RequestBody Diretor diretor) {
        diretorService.salvar(diretor);
    }
}
