package com.cibertec.cibervet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_tipo_mascota", schema = "general")
@Data
public class TipoMascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_mascota")
    private Integer idTipoMascota;
    private String nombre;
}
