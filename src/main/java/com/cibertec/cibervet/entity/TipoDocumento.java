package com.cibertec.cibervet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TipoDocumento {
    @Id
    private Integer idTipoDocumento;
    private String nombre;
}
