package com.soulcode.pizzariaJavaSpring.controller;


import com.soulcode.pizzariaJavaSpring.model.dtos.PizzaDTO;
import com.soulcode.pizzariaJavaSpring.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarPizza",method = RequestMethod.POST) //mapeamento
    public PizzaDTO save(@RequestBody PizzaDTO dto){
        return this.pizzaService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaPizzas", method = RequestMethod.GET) //mapeamento
    public List<PizzaDTO> findAll(){
        return this.pizzaService.findAll();
    }

    @RequestMapping(value = "/obterPizza/{idPizza}", method = RequestMethod.GET) //mapeamento
    public PizzaDTO findById(@PathVariable int idPizza){
        return this.pizzaService.deleteById(idPizza);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarPizza/{idPizza}" , method = RequestMethod.DELETE) //mapeamento
    public PizzaDTO deleteById(@PathVariable int idCliente){
        return this.pizzaService.deleteById(idCliente);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarPizza/{idPizza}", method = RequestMethod.PUT)
    public PizzaDTO updateByid(@PathVariable int idPizza, @RequestBody PizzaDTO dto){
        return this.pizzaService.updateByid(idPizza,dto);
    }
}
