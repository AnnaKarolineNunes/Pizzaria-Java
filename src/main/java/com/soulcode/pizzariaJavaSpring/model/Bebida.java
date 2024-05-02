package com.soulcode.pizzariaJavaSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bebida")
public class Bebida {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebida;

    @Setter
    @Getter
    @Column(length = 50)
    private String nome;

    @Setter
    @Getter
    @Column
    private float preco;

}
