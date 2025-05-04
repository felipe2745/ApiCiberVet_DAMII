package com.cibertec.cibervet.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_usuario", schema = "general")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    private String nombre;
    private String apellidos;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    @Column(name = "nro_documento")
    private String nroDocumento;
    private String correo;
    private String telefono;
    private String username;
    private String password;
    @Column(name = "fecha_registro")
    private String fechaRegistro;
    @OneToMany(mappedBy = "usuario")
    private List<Mascota> mascotas;
}
