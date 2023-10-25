package com.gerenciador.escolar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Professor extends Usuario{
    @ManyToMany(mappedBy = "professores")
    private Set<Disciplina> disciplinas;
    @ManyToOne
    private Escola escola;
}
