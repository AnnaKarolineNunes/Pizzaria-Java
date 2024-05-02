package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.*;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PizzaPedidaDTO {


    @Setter
    @Getter
    private  int idPizzaPedida;

    @Setter
    @Getter
    private int quantidade;

    @Setter
    @Getter
    private Pedido pedido;

    @Setter
    @Getter
    private Pizza pizza;

    @Setter
    @Getter
    private Tamanho tamanho;

    @Setter
    @Getter
    private List<Ingrediente> ingredientes;

    public PizzaPedidaDTO(){
    }

    public PizzaPedidaDTO(int idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public PizzaPedidaDTO(PizzaPedida pizzaPedida) {
        this.idPizzaPedida = pizzaPedida.getIdPizzaPedida();
        this.quantidade = pizzaPedida.getQuantidade();
        this.pedido = pizzaPedida.getPedido();
        this.pizza = pizzaPedida.getPizza();
        this.tamanho = pizzaPedida.getTamanho();
        this.ingredientes = pizzaPedida.getIngredientes();
    }

    public static PizzaPedida convert(PizzaPedidaDTO pizzaPedidaDTO){
        PizzaPedida pizzaPedida = new PizzaPedida();
        pizzaPedida.setIdPizzaPedida(pizzaPedidaDTO.getIdPizzaPedida());
        pizzaPedida.setPizza(pizzaPedidaDTO.getPizza());
        pizzaPedida.setTamanho(pizzaPedidaDTO.getTamanho());
        pizzaPedida.setIngredientes(pizzaPedidaDTO.getIngredientes());
        pizzaPedida.setPedido(pizzaPedidaDTO.getPedido());
        pizzaPedida.setQuantidade(pizzaPedidaDTO.getQuantidade());
        return pizzaPedida;
    }
}
