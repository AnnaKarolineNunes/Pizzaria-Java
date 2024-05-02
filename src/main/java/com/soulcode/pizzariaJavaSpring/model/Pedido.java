package com.soulcode.pizzariaJavaSpring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "idFornada", nullable = false)
    private Fornada fornada;

    @Setter
    @Getter
    @Column
    private Timestamp dataHora;

}
