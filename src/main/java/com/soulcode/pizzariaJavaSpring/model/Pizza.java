package com.soulcode.pizzariaJavaSpring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pizza")
public class Pizza {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizza;

    @Setter
    @Getter
    @Column(length = 50)
    private String nome;

    @Setter
    @Getter
    @Column
    private float precoBase;

    @Setter
    @Getter
    @Column
    private boolean personalizada;
}
