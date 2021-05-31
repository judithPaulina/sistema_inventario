package com.prueba.nexos.models.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombreUsuario;

    @Column(name = "edad")
    private int edad;

    @Temporal(TemporalType.DATE)
    @CreatedDate
    @Column(name = "fecha_ingreso_usuario")
    private Date fechaIngresoUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cargo", referencedColumnName = "id")
    private CargoEntity cargo;

}
