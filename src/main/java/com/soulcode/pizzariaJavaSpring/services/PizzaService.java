package com.soulcode.pizzariaJavaSpring.services;

import com.soulcode.pizzariaJavaSpring.model.Pizza;
import com.soulcode.pizzariaJavaSpring.model.dtos.PizzaDTO;
import com.soulcode.pizzariaJavaSpring.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public PizzaDTO save(PizzaDTO dto){
        Pizza pizza = PizzaDTO.convert(dto);
        pizza = this.pizzaRepository.save(pizza); // salvando no banco de dados
        return new PizzaDTO(pizza);
    }

    public List<PizzaDTO> findAll(){
        List<Pizza>pizzas = this.pizzaRepository.findAll();
        return pizzas.stream().map(PizzaDTO::new).collect(Collectors.toList());
    }

    public PizzaDTO findById(int idPizza){
        Optional<Pizza> resultado = this.pizzaRepository.findById(idPizza); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new PizzaDTO(resultado.get());
        }
    }

    public PizzaDTO deleteById(int idPizza){
        PizzaDTO dto = findById(idPizza);
        this.pizzaRepository.deleteById(idPizza); // deletando pelo id no banco de dados
        return dto;
    }
    public PizzaDTO updateByid(int idPizza, PizzaDTO dto){
        this.findById(idPizza);
        Pizza pizza = PizzaDTO.convert(dto);
        pizza.setIdPizza(idPizza);
        pizza = this.pizzaRepository.save(pizza);
        return new  PizzaDTO(pizza);
    }

}
