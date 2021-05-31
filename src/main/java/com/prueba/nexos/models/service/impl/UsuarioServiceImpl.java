package com.prueba.nexos.models.service.impl;

import com.prueba.nexos.models.dao.UsuarioDao;
import com.prueba.nexos.models.entity.UsuarioEntity;
import com.prueba.nexos.models.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public UsuarioEntity createUsuario(UsuarioEntity usuarioEntity) {
        return usuarioDao.save(usuarioEntity);
    }

    @Override
    public List<UsuarioEntity> getAll() {
        return usuarioDao.findAll();
    }


}
