package com.cibertec.cibervet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_tipo_raza", schema = "general")
@Data
public class TipoRaza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_raza")
    private Integer idTipoRaza;
    private String nombre;
}
