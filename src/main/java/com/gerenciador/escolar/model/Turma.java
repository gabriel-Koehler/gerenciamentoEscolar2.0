package com.gerenciador.escolar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id",unique=true,nullable=false)
    private Integer id;
    private String nome;
    @ManyToOne
    private Escola escola;
    @OneToMany(mappedBy = "turma")
    private Set<Aluno> alunos;
}
