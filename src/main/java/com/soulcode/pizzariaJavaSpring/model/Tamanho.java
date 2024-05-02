package com.soulcode.pizzariaJavaSpring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Length;

@Entity
@Table(name = "tamanho")
public class Tamanho {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTamanho;

    @Setter
    @Getter
    @Column(length = 50)
    private String nome;

    @Setter
    @Getter
    @Column
    private float desconto;
}
