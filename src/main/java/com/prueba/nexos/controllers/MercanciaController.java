package com.prueba.nexos.controllers;

import com.prueba.nexos.filter.MercanciaFilter;
import com.prueba.nexos.models.entity.MercanciaEntity;
import com.prueba.nexos.models.service.MercanciaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RequestMapping("/mercancia")
@RestController
@Api(value = "Mercancia Controller", description = "Controller para el manejo de las mercancias.")
public class MercanciaController {

    @Autowired
    private MercanciaService mercanciaService;

    @ApiOperation(value = "Permite Insertar una mercancia en la base de datos.")
    @PostMapping
    @ResponseBody
    public ResponseEntity<MercanciaEntity> createMercancia(@RequestBody MercanciaEntity mercanciaEntity) throws Exception {
        if (mercanciaService.createMercancia(mercanciaEntity)) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Permite actualizar una mercancia en la base de datos.")
    @ResponseBody
    public ResponseEntity<MercanciaEntity> updateMercancia(@PathVariable(value = "id") Long id, @RequestBody MercanciaEntity mercanciaEntity) throws Exception {
        if (mercanciaService.updateMercancia(mercanciaEntity, id) != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{usuario_id}/{id}")
    @ApiOperation(value = "Permite elminar una mercancia en la base de datos.")
    @ResponseBody
    public ResponseEntity<HttpStatus> deleteMercancia(Long id, Long usuario_id) {
        if (mercanciaService.deleteMercancia(id, usuario_id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping()
    @ApiOperation(value = "Permite traer todas las mercancia en la base de datos.")
    @ResponseBody
    public ResponseEntity<List<MercanciaEntity>> getMercancia() {
        return new ResponseEntity<>(mercanciaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/filter")
    @ApiOperation(value = "Permite traer todas las mercancia en la base de datos.")
    @ResponseBody
    public List<MercanciaEntity> getMercanciaFilter(MercanciaFilter mercanciaFilter) {
        return mercanciaService.filter(mercanciaFilter);
    }
}
