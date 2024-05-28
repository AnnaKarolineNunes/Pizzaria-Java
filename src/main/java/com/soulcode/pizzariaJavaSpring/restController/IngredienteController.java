package com.soulcode.pizzariaJavaSpring.restController;


import com.soulcode.pizzariaJavaSpring.model.dtos.IngredienteDTO;
import com.soulcode.pizzariaJavaSpring.services.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarIngrediente",method = RequestMethod.POST) //mapeamento
    public IngredienteDTO save(@RequestBody IngredienteDTO dto){
        return this.ingredienteService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaIngredientes", method = RequestMethod.GET) //mapeamento
    public List<IngredienteDTO> findAll(){
        return this.ingredienteService.findAll();
    }

    @RequestMapping(value = "/obterIngredientes/{idIngrediente}", method = RequestMethod.GET) //mapeamento
    public IngredienteDTO findById(@PathVariable int idIngrediente){
        return this.ingredienteService.deleteById(idIngrediente);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarIngrediente/{idIngrediente}" , method = RequestMethod.DELETE) //mapeamento
    public IngredienteDTO deleteById(@PathVariable int idIngrediente){
        return this.ingredienteService.deleteById(idIngrediente);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarIngrediente/{idIngrediente}", method = RequestMethod.PUT)
    public IngredienteDTO updateByid(@PathVariable int idIngrediente, @RequestBody IngredienteDTO dto){
        return this.ingredienteService.updateByid(idIngrediente,dto);
    }
}
