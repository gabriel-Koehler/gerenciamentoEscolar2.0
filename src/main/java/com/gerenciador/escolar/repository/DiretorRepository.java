package com.gerenciador.escolar.repository;

import com.gerenciador.escolar.model.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor,Long> {
}
