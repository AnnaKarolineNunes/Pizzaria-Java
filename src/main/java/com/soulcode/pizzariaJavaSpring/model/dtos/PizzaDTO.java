package com.soulcode.pizzariaJavaSpring.model.dtos;
import com.soulcode.pizzariaJavaSpring.model.Pizza;
import lombok.Getter;
import lombok.Setter;
public class PizzaDTO {


    @Setter
    @Getter
    private int idPizza;

    @Setter
    @Getter
    private String nome;

    @Setter
    @Getter
    private float precoBase;

    @Setter
    @Getter
    private boolean personalizada;

    public PizzaDTO(){
    }

    public PizzaDTO(int idPizza) {
        this.idPizza = idPizza;
    }

    public PizzaDTO(Pizza pizza) {
        this.idPizza = pizza.getIdPizza();
        this.nome = pizza.getNome();
        this.precoBase = pizza.getPrecoBase();
        this.personalizada = pizza.isPersonalizada();
    }

    public static Pizza convert(PizzaDTO pizzaDTO){
        Pizza pizza = new Pizza();
        pizza.setIdPizza(pizzaDTO.getIdPizza());
        pizza.setNome(pizzaDTO.getNome());
        pizza.setPrecoBase(pizzaDTO.getPrecoBase());
        pizza.setPersonalizada(pizzaDTO.isPersonalizada());
        return pizza;
    }
}
