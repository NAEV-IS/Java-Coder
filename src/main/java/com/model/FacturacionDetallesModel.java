package com.model;
import jakarta.persistence.*;

@Entity
@Table(name = "facturacion_detalles")
public class FacturacionDetallesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "facturacion_id", nullable = false)
    private FacturacionModel factura;
    @ManyToOne
    @JoinColumn(name = "productos_id", nullable = false)
    private ProductoModel producto;
    private int cantidad;
    private double precio;
}
