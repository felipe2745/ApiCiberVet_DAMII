package com.cibertec.cibervet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_mascota", schema = "general")
@Data
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Integer idMascota;
    private String nombre;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    private String genero;
    @ManyToOne
    @JoinColumn(name = "id_tipo_mascota", referencedColumnName = "id_tipo_mascota")
    private TipoMascota tipoMascota;
    @ManyToOne
    @JoinColumn(name = "id_tipo_raza", referencedColumnName = "id_tipo_raza")
    private TipoRaza tipoRaza;
    private Double peso;
    @Column(name = "fecha_ultima_vacunacion")
    private String fechaUltimaVacunacion;
    @Column(name = "fecha_proxima_vacunacion")
    private String fechaProximaVacunacion;
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;
    @Column(name = "fecha_registro")
    private String fechaRegistro;
}
