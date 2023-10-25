package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.model.Curso;
import com.gerenciador.escolar.repository.AlunoRepository;
import com.gerenciador.escolar.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CursoService {
    private final CursoRepository repository;

    public Curso buscarUm(Long id) {
        return repository.findById(id).get();
    }

    public Collection<Curso> buscarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public void salvar(Curso aluno) {
        repository.save(aluno);
    }
}
