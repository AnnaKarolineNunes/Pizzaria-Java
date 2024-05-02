package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Bebida;
import lombok.Getter;
import lombok.Setter;
public class BebidaDTO {

    @Setter
    @Getter
    private int idBebida;

    @Setter
    @Getter
    private String nome;

    @Setter
    @Getter
    private float preco;

    public BebidaDTO(){
    }

    public BebidaDTO(int idBebida){
        this.idBebida = idBebida;
    }



    public BebidaDTO(Bebida bebida) {
        this.idBebida = bebida.getIdBebida();
        this.nome = bebida.getNome();
        this.preco = bebida.getPreco();
    }

    public static Bebida convert(BebidaDTO bebidaDTO){
        Bebida bebida = new Bebida();
        bebida.setIdBebida(bebidaDTO.getIdBebida());
        bebida.setNome(bebidaDTO.getNome());
        bebida.setPreco(bebidaDTO.getPreco());
        return bebida;
    }


}
