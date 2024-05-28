package com.soulcode.pizzariaJavaSpring.restController;

import com.soulcode.pizzariaJavaSpring.model.dtos.TamanhoDTO;
import com.soulcode.pizzariaJavaSpring.services.TamanhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TamanhoController {

    @Autowired
    private TamanhoService tamanhoService;

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarTamanho",method = RequestMethod.POST) //mapeamento
    public TamanhoDTO save(@RequestBody TamanhoDTO dto){
        return this.tamanhoService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaTamanhos", method = RequestMethod.GET) //mapeamento
    public List<TamanhoDTO> findAll(){
        return this.tamanhoService.findAll();
    }

    @RequestMapping(value = "/obterTamanho/{idTamanho}", method = RequestMethod.GET) //mapeamento
    public TamanhoDTO findById(@PathVariable int idTamanho){
        return this.tamanhoService.deleteById(idTamanho);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarTamanho/{idTamanho}" , method = RequestMethod.DELETE) //mapeamento
    public TamanhoDTO deleteById(@PathVariable int idTamanho){
        return this.tamanhoService.deleteById(idTamanho);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarTamanho/{idTamanho}", method = RequestMethod.PUT)
    public TamanhoDTO updateByid(@PathVariable int idTamanho, @RequestBody TamanhoDTO dto){
        return this.tamanhoService.updateByid(idTamanho,dto);
    }

}
