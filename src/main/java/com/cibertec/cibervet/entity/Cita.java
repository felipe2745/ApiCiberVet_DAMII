package com.cibertec.cibervet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_cita", schema = "general")
@Data
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer idCita;
    @Column(name = "fecha_cita")
    private String fechaCita;
    @Column(name = "hora_cita")
    private String horaCita;
    @Column(name = "fecha_creacion")
    private String fechaCreacion;
    private String observacion;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_mascota", referencedColumnName = "id_mascota")
    private Mascota mascota;
}
