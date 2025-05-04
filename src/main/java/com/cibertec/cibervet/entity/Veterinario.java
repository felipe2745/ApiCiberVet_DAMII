package com.cibertec.cibervet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_veterinario", schema = "general")
@Data
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veterinario")
    private Integer idVeterinario;
    private String nombre;
    private String codigo;
}
