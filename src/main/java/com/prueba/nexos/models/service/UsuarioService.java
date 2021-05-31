package com.prueba.nexos.models.service;

import com.prueba.nexos.models.entity.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    UsuarioEntity createUsuario(UsuarioEntity usuarioEntity);

    List<UsuarioEntity> getAll();
}
