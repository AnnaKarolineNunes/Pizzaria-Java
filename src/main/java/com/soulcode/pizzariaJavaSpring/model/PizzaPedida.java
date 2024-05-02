package com.soulcode.pizzariaJavaSpring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
public class PizzaPedida {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idPizzaPedida;

    @Setter
    @Getter
    @Column
    private int quantidade;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "idPizza")
    private Pizza pizza;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "idTamanho")
    private Tamanho tamanho;

    @Setter
    @Getter
    @ManyToMany
    @JoinTable(
            name = "pizzaPedida_has_Ingrediente",
            joinColumns = @JoinColumn(name = "idPizzaPedida"),
            inverseJoinColumns = @JoinColumn(name = "idIngrediente")
    )
    private List<Ingrediente>ingredientes;

}
