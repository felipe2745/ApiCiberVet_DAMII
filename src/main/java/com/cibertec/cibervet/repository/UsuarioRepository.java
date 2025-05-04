package com.cibertec.cibervet.repository;

import com.cibertec.cibervet.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
