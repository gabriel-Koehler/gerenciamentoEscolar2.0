package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Professor;
import com.gerenciador.escolar.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public Professor buscarUm(Long id) {
        Optional<Professor> professorOptional = professorRepository.findById(id);
        return professorOptional.get();
    }

    public Collection<Professor> buscarTodos() {
        return professorRepository.findAll();
    }

    public void deletar(Long id) {
        professorRepository.deleteById(id);
    }

    public void salvar(Professor professor) {
        professorRepository.save(professor);
    }
}
