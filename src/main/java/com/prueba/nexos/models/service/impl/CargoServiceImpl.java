package com.prueba.nexos.models.service.impl;

import com.prueba.nexos.models.dao.CargoDao;
import com.prueba.nexos.models.entity.CargoEntity;
import com.prueba.nexos.models.service.CargoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao cargoDao;


    @Override
    public CargoEntity createCargo(CargoEntity cargoEntity) {
        return cargoDao.save(cargoEntity);
    }

    @Override
    public List<CargoEntity> getAll() {
        return cargoDao.findAll();
    }


}

