package com.soulcode.pizzariaJavaSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fornada")
public class Fornada {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFornada;

    @Setter
    @Getter
    @Column
    private int numFornada;

    @Setter
    @Getter
    @Column
    private int qtdPizzas;

}
