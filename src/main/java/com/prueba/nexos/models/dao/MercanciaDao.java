package com.prueba.nexos.models.dao;

import com.prueba.nexos.models.entity.MercanciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface MercanciaDao extends JpaRepository<MercanciaEntity, Serializable> {

    Optional<MercanciaEntity> findByNombreProducto(String nombreProducto);


}
