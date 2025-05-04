package com.cibertec.cibervet.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponse {
    public Integer idUsuario;
    public String mensaje;
}
