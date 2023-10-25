package com.gerenciador.escolar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioIdClass implements Serializable {
    private Long id;
    private Long cpf;
}
