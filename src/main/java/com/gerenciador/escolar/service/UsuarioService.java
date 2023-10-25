package com.gerenciador.escolar.service;

import com.gerenciador.escolar.model.Endereco;
import com.gerenciador.escolar.model.Usuario;
import com.gerenciador.escolar.model.UsuarioIdClass;
import com.gerenciador.escolar.repository.EnderecoRepository;
import com.gerenciador.escolar.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;

    public Usuario buscarUm(Long id,Long cpf) {
        return repository.findById(new UsuarioIdClass(id,cpf)).get();
    }

    public Collection<Usuario> buscarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id,Long cpf) {
        repository.deleteById(new UsuarioIdClass(id,cpf));
    }

    public void salvar(Usuario aluno) {
        repository.save(aluno);
    }
}
