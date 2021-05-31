package com.prueba.nexos.controllers;

import com.prueba.nexos.models.entity.UsuarioEntity;
import com.prueba.nexos.models.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/usuario")
@RestController
@Api(value = "Usuario Controller", description = "Controller para el manejo de los usuarios.")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @ApiOperation(value = "Permite Insertar un usuario en la base de datos.")
    @PostMapping
    @ResponseBody
    public ResponseEntity<UsuarioEntity> createUsuario(@RequestBody UsuarioEntity usuarioEntity) {
        return new ResponseEntity<>(usuarioService.createUsuario(usuarioEntity), HttpStatus.CREATED);
    }

    @GetMapping()
    @ApiOperation(value = "Permite traer todos los usuarios en la base de datos.")
    @ResponseBody
    public ResponseEntity<List<UsuarioEntity>> getUsuario() {
        return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }

}
