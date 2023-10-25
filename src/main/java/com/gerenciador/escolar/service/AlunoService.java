package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public Aluno buscarUm(Long id) {
        return alunoRepository.findById(id).get();
    }

    public Collection<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

    public void salvar(Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
