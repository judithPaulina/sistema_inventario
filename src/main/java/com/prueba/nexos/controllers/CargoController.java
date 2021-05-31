package com.prueba.nexos.controllers;

import com.prueba.nexos.models.entity.CargoEntity;
import com.prueba.nexos.models.service.CargoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("/cargo")
@RestController
@Api(value = "Cargo Controller", description = "Controller para el manejo de los cargos.")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @ApiOperation(value = "Permite Insertar un cargo en la base de datos.")
    @PostMapping
    @ResponseBody
    public ResponseEntity<CargoEntity> createCargo(@RequestBody CargoEntity cargoEntity) {
        return new ResponseEntity<>(cargoService.createCargo(cargoEntity), HttpStatus.CREATED);
    }

    @GetMapping()
    @ApiOperation(value = "Permite traer todas los cargos en la base de datos.")
    @ResponseBody
    public ResponseEntity<List<CargoEntity>> getMercancia() {
        return new ResponseEntity<>(cargoService.getAll(), HttpStatus.OK);
    }



}
