package com.prueba.nexos.models.service.impl;

import com.prueba.nexos.filter.MercanciaFilter;
import com.prueba.nexos.models.dao.MercanciaDao;
import com.prueba.nexos.models.entity.MercanciaEntity;
import com.prueba.nexos.models.service.MercanciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MercanciaServiceImpl implements MercanciaService {

    @Autowired
    private MercanciaDao mercanciaDao;


    @Override
    public boolean createMercancia(MercanciaEntity mercanciaEntity) throws Exception {
        Boolean validaciones = validaciónMercancia(mercanciaEntity);

        if (validaciones) {
            mercanciaEntity.setUsuarioEditar(mercanciaEntity.getUsuarioRegistar());
            mercanciaEntity.setFechaModificacionMercancia(mercanciaEntity.getFechaIngresoMercancia());
            mercanciaDao.save(mercanciaEntity);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteMercancia(Long id, Long usuario_id) {
        MercanciaEntity mercanciaEntity = mercanciaDao.findById(id).orElse(null);
        if (mercanciaEntity != null) {
            if (mercanciaEntity.getUsuarioRegistar().getId().equals(usuario_id)) {
                mercanciaDao.deleteById(id);
                return true;
            }
        }
        return false;
    }

    @Transactional
    public MercanciaEntity updateMercancia(MercanciaEntity mercanciaEntity, Long id) throws Exception {
        Date fechaActual = new Date(System.currentTimeMillis());
        SimpleDateFormat formatFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formatFecha.format((fechaActual));
        Date fechaInicioDate = formatFecha.parse(fecha);

        Boolean validaciones = validaciónMercancia(mercanciaEntity);
        try {
            if (validaciones) {
                MercanciaEntity mercanciaEntityUpdate = mercanciaDao.findById(id).orElse(null);
                if (mercanciaEntityUpdate != null) {
                    mercanciaEntityUpdate.setNombreProducto(mercanciaEntity.getNombreProducto());
                    mercanciaEntityUpdate.setCantidad(mercanciaEntity.getCantidad());
                    mercanciaEntityUpdate.setFechaModificacionMercancia(fechaInicioDate);
                    mercanciaEntityUpdate.setUsuarioEditar(mercanciaEntity.getUsuarioEditar());

                    return mercanciaDao.save(mercanciaEntityUpdate);
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error actualizando la mercancia");;

        }

        return null;
    }

    @Override
    public List<MercanciaEntity> filter(MercanciaFilter filter) {

        List<MercanciaEntity> allMercancia = getAll();
        List<MercanciaEntity> resultado = new ArrayList<>();

        for (MercanciaEntity busqueda : allMercancia) {

            if (busqueda.getNombreProducto().equals(filter.getNombreProducto())) {
                resultado.add(busqueda);
            }
            if (busqueda.getUsuarioRegistar().equals(filter.getUsuarioRegistar())) {
                resultado.add(busqueda);
            }
            if (busqueda.getFechaIngresoMercancia().equals(filter.getFechaIngresoMercancia())) {
                resultado.add(busqueda);
            }
        }
        return resultado;
    }

    @Override
    public List<MercanciaEntity> getAll() {
        return mercanciaDao.findAll();
    }

    public Boolean validaciónMercancia(MercanciaEntity mercanciaEntity) throws Exception {
        Date fechaActual = new Date(System.currentTimeMillis());
        SimpleDateFormat formatFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formatFecha.format((fechaActual));
        Date fechaInicioDate = formatFecha.parse(fecha);

        MercanciaEntity mercanciaEntity1 = mercanciaDao.findByNombreProducto(mercanciaEntity.getNombreProducto()).orElse(null);

        if (mercanciaEntity.getFechaIngresoMercancia().before(fechaInicioDate)
                || mercanciaEntity.getFechaIngresoMercancia().equals(fechaInicioDate)) {
            if (mercanciaEntity1 != null) {
                return false;
            }
        }
        return true;
    }
}
