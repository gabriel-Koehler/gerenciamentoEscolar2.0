package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.model.Turma;
import com.gerenciador.escolar.repository.AlunoRepository;
import com.gerenciador.escolar.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TurmaService {
    private final TurmaRepository turmaRepository;


    public Turma buscarUm(Long id) {
        Optional<Turma> secretarioOptional = turmaRepository.findById(id);
        return secretarioOptional.get();
    }

    public Collection<Turma> buscarTodos() {
        return turmaRepository.findAll();
    }

    public void deletar(Long id) {
        turmaRepository.deleteById(id);
    }

    public void salvar(Turma turma) {
        turmaRepository.save(turma);
    }
}
