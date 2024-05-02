package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Ingrediente;
import lombok.Getter;
import lombok.Setter;
public class IngredienteDTO {

    @Setter
    @Getter
    private int idIngrediente;

    @Setter
    @Getter
    private String nome;

    @Setter
    @Getter
    private float preco;

    public IngredienteDTO(){
    }

    public IngredienteDTO(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public IngredienteDTO(Ingrediente ingrediente){
        this.idIngrediente = ingrediente.getIdIngrediente();
        this.nome = ingrediente.getNome();
        this.preco = ingrediente.getPreco();
    }

   public static Ingrediente convert(IngredienteDTO ingredienteDTO){
       Ingrediente ingrediente = new Ingrediente();
       ingrediente.setIdIngrediente(ingredienteDTO.getIdIngrediente());
       ingrediente.setNome(ingredienteDTO.getNome());
       ingrediente.setPreco(ingredienteDTO.getPreco());
       return ingrediente;
   }


}
