package com.soulcode.pizzariaJavaSpring.controller;


import com.soulcode.pizzariaJavaSpring.model.dtos.PedidoDTO;
import com.soulcode.pizzariaJavaSpring.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService; // injeção de dependencias

    //POST
    @RequestMapping(value = "/salvarPedido", method = RequestMethod.POST)
    public PedidoDTO save(@RequestBody PedidoDTO dto){
        return  this.pedidoService.save(dto);
    }

    //GET
    @RequestMapping(value = "/obterListaPedidos" , method = RequestMethod.GET)
    public List<PedidoDTO> findAll(){
        return this.pedidoService.findAll();
    }
    @RequestMapping(value = "/obterPedido/{idPedido}",method = RequestMethod.GET)
    public PedidoDTO findById(@PathVariable int idPedido){
        return  this.pedidoService.findById(idPedido);
    }
    //DELETE
    @RequestMapping(value = "/deletarPedido/{idPedido}", method = RequestMethod.DELETE)
    public PedidoDTO deleteById(@PathVariable int idPedido){
        return this.pedidoService.deleteById(idPedido);
    }

    //PUT
    @RequestMapping(value = "/atualizarPedido/{idPedido}", method = RequestMethod.PUT)
    public PedidoDTO updatebyId(@PathVariable int idPedido, @RequestBody PedidoDTO dto){
        return this.pedidoService.updateByid(idPedido,dto);
    }


}
