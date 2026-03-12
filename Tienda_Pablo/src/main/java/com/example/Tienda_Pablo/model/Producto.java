package com.example.Tienda_Pablo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    private String nombre;
    private String descripcion;
    private Double precio;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

   
}
