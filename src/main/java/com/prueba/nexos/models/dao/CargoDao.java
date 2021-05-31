package com.prueba.nexos.models.dao;

import com.prueba.nexos.models.entity.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoDao extends JpaRepository<CargoEntity, Long> {
}
