package com.registro.registro.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="datos")
public class DatosUsuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="documentoIdentificacionUsario")
    private String documentoIdentificacionUsario;
    @Column(name="nombreUsuario")
    private String nombreUsuario;
}
