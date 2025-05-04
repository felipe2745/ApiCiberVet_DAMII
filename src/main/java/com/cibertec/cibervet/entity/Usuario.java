package com.cibertec.cibervet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private Integer idUsuario;
    private String nombre;
    private String apellidos;
    @ManyToOne
//    @JoinColumn(name = "tipo_documento_id_tipo_documento")
    private TipoDocumento tipoDocumento;
    private String nroDocumento;
    private String correo;
    private String telefono;
    private String username;
    private String password;

}
