package com.prueba.nexos.models.service;

import com.prueba.nexos.filter.MercanciaFilter;
import com.prueba.nexos.models.entity.MercanciaEntity;

import java.util.List;

public interface MercanciaService {

    boolean createMercancia(MercanciaEntity mercanciaEntity) throws Exception;

    Boolean deleteMercancia(Long id, Long usuario_id);

    MercanciaEntity updateMercancia(MercanciaEntity mercanciaEntity, Long id) throws Exception;

    List<MercanciaEntity> filter(MercanciaFilter filter);

    List<MercanciaEntity> getAll();

}
