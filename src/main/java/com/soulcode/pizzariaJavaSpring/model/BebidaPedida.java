package com.soulcode.pizzariaJavaSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bebida-pedida")
public class BebidaPedida {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebidaPedida;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idBebida")
    private Bebida bebida;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "idPedido",nullable = false)
    private Pedido pedido;


    @Getter
    @Setter
    @Column(nullable = false)
    private int quantidade;

}
