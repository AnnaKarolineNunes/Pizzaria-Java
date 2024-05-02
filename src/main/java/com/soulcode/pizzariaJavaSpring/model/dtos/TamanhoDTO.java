package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Tamanho;
import lombok.Getter;
import lombok.Setter;
public class TamanhoDTO {

    @Setter
    @Getter
    private int idTamanho;

    @Setter
    @Getter
    private String nome;

    @Setter
    @Getter
    private float desconto;

    public TamanhoDTO(){
    }

    public TamanhoDTO(int idTamanho) {
        this.idTamanho = idTamanho;
    }

    public TamanhoDTO(Tamanho tamanho) {
        this.idTamanho = tamanho.getIdTamanho();
        this.nome = tamanho.getNome();
        this.desconto = tamanho.getDesconto();
    }

    public static Tamanho convert(TamanhoDTO tamanhoDTO){
        Tamanho tamanho = new Tamanho();
        tamanho.setIdTamanho(tamanhoDTO.getIdTamanho());
        tamanho.setNome(tamanhoDTO.getNome());
        tamanho.setDesconto(tamanhoDTO.getIdTamanho());
        tamanho.setDesconto(tamanhoDTO.getIdTamanho());
        return tamanho;
    }
}
