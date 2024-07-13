package com.example.demoJava.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoJava.Repositories.UsuarioRepository;
import com.example.demoJava.Models.UsuariosModel;
import java.util.ArrayList;

@Service
public class GestorUsuariosService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ArrayList<UsuariosModel> getUsuarios() {
        return (ArrayList<UsuariosModel>) usuarioRepository.findAll();
    }

    public UsuariosModel guardarUsuario(UsuariosModel usuario) {
        return usuarioRepository.save(usuario);
    }
}
