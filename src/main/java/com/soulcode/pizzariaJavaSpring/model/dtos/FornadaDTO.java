package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Fornada;
import lombok.Getter;
import lombok.Setter;
public class FornadaDTO {

    @Setter
    @Getter
    private int idFornada;

    @Setter
    @Getter
    private int numFornada;

    @Setter
    @Getter
    private int qtdPizzas;

    public FornadaDTO(){
    }

    public FornadaDTO(Fornada fornada) {
        this.idFornada = fornada.getIdFornada();
        this.numFornada = fornada.getNumFornada();
        this.qtdPizzas = fornada.getQtdPizzas();
    }

    public static Fornada convert(FornadaDTO fornadaDTO){
        Fornada fornada = new Fornada();
        fornada.setIdFornada(fornadaDTO.getIdFornada());
        fornada.setNumFornada(fornadaDTO.getNumFornada());
        fornada.setQtdPizzas(fornadaDTO.getQtdPizzas());
        return fornada;
    }
}
