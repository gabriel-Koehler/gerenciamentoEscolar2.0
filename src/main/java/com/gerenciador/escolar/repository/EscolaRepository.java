package com.gerenciador.escolar.repository;

import com.gerenciador.escolar.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola,Long> {
}
