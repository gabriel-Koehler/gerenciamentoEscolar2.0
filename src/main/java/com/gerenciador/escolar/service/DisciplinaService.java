package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Disciplina;
import com.gerenciador.escolar.model.Professor;
import com.gerenciador.escolar.repository.DisciplinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DisciplinaService {
    private final DisciplinaRepository disciplinaRepository;
    private final ProfessorService professorService;


    public Disciplina buscarUm(Long id) {
        Optional<Disciplina> disciplinaOptional = disciplinaRepository.findById(id);
        return disciplinaOptional.get();
    }

    public Collection<Disciplina> buscarTodos() {
        return disciplinaRepository.findAll();
    }

    public void deletar(Long id) {
        disciplinaRepository.deleteById(id);
    }

    public void salvar(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }
}
