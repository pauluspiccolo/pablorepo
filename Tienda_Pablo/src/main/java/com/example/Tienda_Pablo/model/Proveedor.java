package com.example.Tienda_Pablo.model;

import java.time.LocalDateTime;
import lombok.*;
import jakarta.persistence.*; 

@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;

    private String nombre;
    private String contacto;
    private String telefono;
    private String email;
    private String direccion;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    
}
