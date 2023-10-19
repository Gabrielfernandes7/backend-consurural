package com.consurural.consurural.services;

import com.consurural.consurural.models.Usuario;
import com.consurural.consurural.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

}
