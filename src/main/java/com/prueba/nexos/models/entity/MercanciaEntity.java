package com.prueba.nexos.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@Table(name = "mercancia")
public class MercanciaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "producto")
    private String nombreProducto;

    @Column(name = "cantidad")
    private int cantidad;

    @Temporal(TemporalType.DATE)
    @CreatedDate
    @Column(name = "fecha_ingreso_mercancia")
    private Date fechaIngresoMercancia;

    @Temporal(TemporalType.DATE)
    @LastModifiedDate
    @Column(name = "fecha_nodificacion_mercancia")
    private Date fechaModificacionMercancia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registrado", referencedColumnName = "id")
    private UsuarioEntity usuarioRegistar;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "editado", referencedColumnName = "id")
    private UsuarioEntity usuarioEditar;
}
