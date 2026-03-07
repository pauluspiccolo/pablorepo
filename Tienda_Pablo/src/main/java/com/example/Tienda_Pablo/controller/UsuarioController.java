package com.example.Tienda_Pablo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.example.Tienda_Pablo.model.Usuario;

 @RestController
@RequestMapping("/usuarios")
public class UsuarioController{

     private List<Usuario> listaUsuarios = new ArrayList<>();

    // Constructor para llenar la lista al iniciar
    public UsuarioController() {
        listaUsuarios.add(new Usuario(1, "Pablo", "pauluspiccolo@yahho.com", 23));
        listaUsuarios.add(new Usuario(2, "Maria", "mariadenisse@hotmail.com", 55));
        listaUsuarios.add(new Usuario(3, "Carlos", "carlozx77@gmail,com", 18));
        listaUsuarios.add(new Usuario(4, "Ana", "analuis45@yahoo.com", 33));
        listaUsuarios.add(new Usuario(5, "Luis", "Luiz0@hotmail.com", 27));
    }

    // GET - Obtener todos
    @GetMapping
    public List<Usuario> listar() {
        return listaUsuarios;
    }

    // GET - Obtener por ID
    @GetMapping("/{id}")
    public Usuario obtener(@PathVariable int id) {
        return listaUsuarios.stream()
        .filter(u -> u.getId() == id)
        .findFirst()
        .orElse(null);
    }

    // 3 POST - Crear usuario
    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }

    // PUT - Actualizar usuario
    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        for (Usuario u : listaUsuarios) {
            if (u.getId()==id) {
                u.setNombre(usuarioActualizado.getNombre());
                return u;
            }
        }
        return null;
    }

    // DELETE - Eliminar usuario
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        listaUsuarios.removeIf(u -> u.getId()==id);
        return "Usuario eliminado";
    }
}