package com.soulcode.pizzariaJavaSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ingrediente")
public class Ingrediente {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngrediente;

    @Setter
    @Getter
    @Column(length = 50)
    private String nome;

    @Setter
    @Getter
    @Column
    private float preco;

}
