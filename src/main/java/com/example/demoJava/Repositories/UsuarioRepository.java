package com.example.demoJava.Repositories;

import com.example.demoJava.Models.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuariosModel, Long> {

}
