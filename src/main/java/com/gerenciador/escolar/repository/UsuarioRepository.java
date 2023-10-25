package com.gerenciador.escolar.repository;

import com.gerenciador.escolar.model.Usuario;
import com.gerenciador.escolar.model.UsuarioIdClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioIdClass> {}
