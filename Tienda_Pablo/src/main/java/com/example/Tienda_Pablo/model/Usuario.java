package com.example.Tienda_Pablo.model;


public class Usuario {

   
    private int id;

    private String nombre;
    private String correo;
    private int edad;

    // 🔹 Constructor vacío (OBLIGATORIO para Spring)
    public Usuario() {
    }

    // 🔹 Constructor con parámetros
    public Usuario(int id, String nombre, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    // 🔹 Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}