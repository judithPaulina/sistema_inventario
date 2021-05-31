package com.prueba.nexos.filter;

import com.prueba.nexos.models.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MercanciaFilter {

    private String nombreProducto;
    private Date fechaIngresoMercancia;
    private UsuarioEntity usuarioRegistar;

}
