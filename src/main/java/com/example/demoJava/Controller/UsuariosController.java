package com.example.demoJava.Controller;

import com.example.demoJava.Models.UsuariosModel;
import com.example.demoJava.Services.GestorUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    GestorUsuariosService usuariosService;

    @GetMapping()
    public ArrayList<UsuariosModel> getAllUsuarios() {
        return usuariosService.getUsuarios();
    }

    @PostMapping()
    public UsuariosModel guardarUsuario(@RequestBody UsuariosModel usuario) {
        return usuariosService.guardarUsuario(usuario);
    }
}
