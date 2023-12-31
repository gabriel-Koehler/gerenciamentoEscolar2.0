package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Aluno;
import com.gerenciador.escolar.model.UsuarioIdClass;
import com.gerenciador.escolar.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AlunoService {
    private final AlunoRepository repository;

    public Aluno buscarUm(Long id,Long cpf) {
        return repository.findById(new UsuarioIdClass(id,cpf)).get();
    }

    public Collection<Aluno> buscarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id,Long cpf) {
        repository.deleteById(new UsuarioIdClass(id,cpf));
    }

    public void salvar(Aluno aluno) {
        repository.save(aluno);
    }
}
