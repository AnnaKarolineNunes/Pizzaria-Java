package com.soulcode.pizzariaJavaSpring.restController;


import com.soulcode.pizzariaJavaSpring.model.dtos.PizzaPedidaDTO;
import com.soulcode.pizzariaJavaSpring.services.PizzaPedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaPedidaController {

    @Autowired
    private PizzaPedidaService pizzaPedidaService;

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarPizzaPedida",method = RequestMethod.POST) //mapeamento
    public PizzaPedidaDTO save(@RequestBody PizzaPedidaDTO dto){
        return this.pizzaPedidaService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaPizaPedidas", method = RequestMethod.GET) //mapeamento
    public List<PizzaPedidaDTO> findAll(){
        return this.pizzaPedidaService.findAll();
    }

    @RequestMapping(value = "/obterPizza/{v}", method = RequestMethod.GET) //mapeamento
    public PizzaPedidaDTO findById(@PathVariable int idPizzaPedida){
        return this.pizzaPedidaService.deleteById(idPizzaPedida);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarPizzas/{idPizzaPedida}" , method = RequestMethod.DELETE) //mapeamento
    public PizzaPedidaDTO deleteById(@PathVariable int idPizzaPedida){
        return this.pizzaPedidaService.deleteById(idPizzaPedida);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarPizza/{idPizzaPedida}", method = RequestMethod.PUT)
    public PizzaPedidaDTO updateByid(@PathVariable int idPizzaPedida, @RequestBody PizzaPedidaDTO dto){
        return this.pizzaPedidaService.updateByid(idPizzaPedida,dto);
    }
}
