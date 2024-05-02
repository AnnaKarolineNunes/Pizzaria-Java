package com.soulcode.pizzariaJavaSpring.controller;

import com.soulcode.pizzariaJavaSpring.model.dtos.FornadaDTO;
import com.soulcode.pizzariaJavaSpring.services.FornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class FornadaController {

    @Autowired
    private FornadaService fornadaService; // injeção de dependencias

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarFornada",method = RequestMethod.POST) //mapeamento
    public FornadaDTO save(@RequestBody FornadaDTO dto){
        return this.fornadaService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaFornadas", method = RequestMethod.GET) //mapeamento
    public List<FornadaDTO> findAll(){
        return this.fornadaService.findAll();
    }

    @RequestMapping(value = "/obterFornada/{idFornada}", method = RequestMethod.GET) //mapeamento
    public FornadaDTO findById(@PathVariable int idFornada){
        return this.fornadaService.deleteById(idFornada);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarFornada/{idFornada}" , method = RequestMethod.DELETE) //mapeamento
    public FornadaDTO deleteById(@PathVariable int idFornada){
        return this.fornadaService.deleteById(idFornada);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarFornada/{idFornada}", method = RequestMethod.PUT)
    public FornadaDTO updateByid(@PathVariable int idFornada, @RequestBody FornadaDTO dto){
        return this.fornadaService.updateByid(idFornada,dto);
    }
}
