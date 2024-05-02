package com.soulcode.pizzariaJavaSpring.controller;


import com.soulcode.pizzariaJavaSpring.model.dtos.BebidaPedidaDTO;
import com.soulcode.pizzariaJavaSpring.services.BebidaPedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BebidaPedidaController {

    @Autowired
    private BebidaPedidaService bebidaPedidaService;

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarBebidaPedida",method = RequestMethod.POST) //mapeamento
    public BebidaPedidaDTO save(@RequestBody BebidaPedidaDTO dto){
        return this.bebidaPedidaService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaBebidasPedidas", method = RequestMethod.GET) //mapeamento
    public List<BebidaPedidaDTO> findAll(){
        return this.bebidaPedidaService.findAll();
    }

    @RequestMapping(value = "/obterBebidasPedidas/{idBebidaPedida}", method = RequestMethod.GET) //mapeamento
    public BebidaPedidaDTO findById(@PathVariable long idBebidaPedida){
        return this.bebidaPedidaService.deleteById(idBebidaPedida);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarBebidaPedida/{idBebidaPedida}" , method = RequestMethod.DELETE) //mapeamento
    public BebidaPedidaDTO deleteById(@PathVariable long idBebidaPedida){
        return this.bebidaPedidaService.deleteById(idBebidaPedida);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarBebidaPedida/{idBebidaPedida}", method = RequestMethod.PUT)
    public BebidaPedidaDTO updateByid(@PathVariable long idBebidaPedida, @RequestBody BebidaPedidaDTO dto){
        return this.bebidaPedidaService.updateByid(idBebidaPedida,dto);
    }
}
