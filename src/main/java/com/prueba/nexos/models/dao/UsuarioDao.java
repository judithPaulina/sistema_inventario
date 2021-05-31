package com.prueba.nexos.models.dao;

import com.prueba.nexos.models.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<UsuarioEntity, Long> {
}
