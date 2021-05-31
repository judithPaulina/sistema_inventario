package com.prueba.nexos.models.service;

import com.prueba.nexos.models.entity.CargoEntity;

import java.util.List;

public interface CargoService {

    CargoEntity createCargo(CargoEntity cargoEntity);

    List<CargoEntity> getAll();

}
