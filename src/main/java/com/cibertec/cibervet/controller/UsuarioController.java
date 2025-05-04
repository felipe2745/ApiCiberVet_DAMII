package com.cibertec.cibervet.controller;

import com.cibertec.cibervet.dto.UsuarioResponse;
import com.cibertec.cibervet.entity.Usuario;
import com.cibertec.cibervet.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/registrarUsuario")
    public UsuarioResponse registrarUsuario(@RequestBody Usuario usuario) {
        Usuario registro = usuarioRepository.save(usuario);
        System.out.println("Registrando usuario");

        UsuarioResponse response = UsuarioResponse.builder()
                .idUsuario(registro.getIdUsuario())
                .mensaje("Usuario registrado")
                .build();

        return ResponseEntity.ok(response).getBody();
    }
}
