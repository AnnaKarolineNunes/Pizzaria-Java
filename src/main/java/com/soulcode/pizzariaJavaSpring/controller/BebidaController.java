package com.soulcode.pizzariaJavaSpring.controller;


import com.soulcode.pizzariaJavaSpring.model.dtos.BebidaDTO;
import com.soulcode.pizzariaJavaSpring.model.dtos.ClienteDTO;
import com.soulcode.pizzariaJavaSpring.services.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BebidaController {

    @Autowired
    private BebidaService bebidaService;

    //POST
    @RequestMapping(value = "/salvarBebida", method = RequestMethod.POST)
    public BebidaDTO save(@RequestBody BebidaDTO dto){
        return this.bebidaService.save(dto);
    }

    //GET
    @RequestMapping(value = "/obterListaBebidas", method = RequestMethod.GET) //mapeamento
    public List<BebidaDTO> findAll(){
        return this.bebidaService.findAll();
    }

    @RequestMapping(value = "/obterBebida/{idBebida}", method = RequestMethod.GET) //mapeamento
    public BebidaDTO findById(@PathVariable int idBebida){
        return this.bebidaService.deleteById(idBebida);
    }

    //DELETE
    @RequestMapping(value = "/deletarBebida/{idBebida}" , method = RequestMethod.DELETE) //mapeamento
    public BebidaDTO deleteById(@PathVariable int idBebida){
        return this.bebidaService.deleteById(idBebida);
    }

    //PUT
    @RequestMapping(value = "/atualizarBebida/{idBebida}", method = RequestMethod.PUT)
    public BebidaDTO updateByid(@PathVariable int idBebida, @RequestBody BebidaDTO dto){
        return this.bebidaService.updateById(idBebida,dto);
    }


}
