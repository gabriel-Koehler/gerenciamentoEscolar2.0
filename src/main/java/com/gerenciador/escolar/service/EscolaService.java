package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Curso;
import com.gerenciador.escolar.model.Escola;
import com.gerenciador.escolar.repository.CursoRepository;
import com.gerenciador.escolar.repository.EscolaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@AllArgsConstructor
public class EscolaService {
    private final EscolaRepository repository;

    public Escola buscarUm(Long id) {
        return repository.findById(id).get();
    }

    public Collection<Escola> buscarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public void salvar(Escola aluno) {
        repository.save(aluno);
    }
}
