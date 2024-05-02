package com.soulcode.pizzariaJavaSpring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Setter
    @Getter
    @Column(length = 100)
    private String nome;

    @Setter
    @Getter
    @Column(length = 100)
    private String telefone;

    @Setter
    @Getter
    @Column(length = 200)
    private String endereco;

    @Setter
    @Getter
    @Column(length = 30)
    private String login;

    @Setter
    @Getter
    @Column(length = 30)
    private String senha;


}
