package com.cibertec.cibervet.service.impl;

import com.cibertec.cibervet.repository.UsuarioRepository;
import com.cibertec.cibervet.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
}
