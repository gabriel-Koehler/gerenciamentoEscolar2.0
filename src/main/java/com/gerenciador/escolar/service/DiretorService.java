package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Diretor;
import com.gerenciador.escolar.repository.DiretorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DiretorService {
    private final DiretorRepository diretorRepository;


    public Diretor buscarUm(Long id) {
        Optional<Diretor> secretarioOptional = diretorRepository.findById(id);
        return secretarioOptional.get();
    }

    public Collection<Diretor> buscarTodos() {
        return diretorRepository.findAll();
    }

    public void deletar(Long id) {
        diretorRepository.deleteById(id);
    }

    public void salvar(Diretor diretor) {
        diretorRepository.save(diretor);
    }
}
