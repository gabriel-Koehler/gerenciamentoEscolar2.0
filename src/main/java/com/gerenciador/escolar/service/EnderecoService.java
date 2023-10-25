package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Endereco;
import com.gerenciador.escolar.model.Escola;
import com.gerenciador.escolar.repository.EnderecoRepository;
import com.gerenciador.escolar.repository.EscolaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@AllArgsConstructor
public class EnderecoService {
    private final EnderecoRepository repository;

    public Endereco buscarUm(Long id) {
        return repository.findById(id).get();
    }

    public Collection<Endereco> buscarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public void salvar(Endereco aluno) {
        repository.save(aluno);
    }
}
