package com.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "facturacion")
public class FacturacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private ClienteModel cliente;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    private double total;
}
