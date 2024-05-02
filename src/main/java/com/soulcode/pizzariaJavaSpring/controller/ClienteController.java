package com.soulcode.pizzariaJavaSpring.controller;
import com.soulcode.pizzariaJavaSpring.model.dtos.ClienteDTO;
import com.soulcode.pizzariaJavaSpring.repositories.ClienteRepository;
import com.soulcode.pizzariaJavaSpring.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {


    @Autowired
    private ClienteService clienteService; // injeção de dependencias

    // POST = SALVAR INFORMAÇÕES
    @RequestMapping(value = "/salvarCliente",method = RequestMethod.POST) //mapeamento
    public ClienteDTO save(@RequestBody ClienteDTO dto){
        return this.clienteService.save(dto);
    }

    // GET = OBTER INFORMAÇÕES
    @RequestMapping(value = "/obterListaClientes", method = RequestMethod.GET) //mapeamento
    public List<ClienteDTO> findAll(){
        return this.clienteService.findAll();
    }

    @RequestMapping(value = "/obterCliente/{idCliente}", method = RequestMethod.GET) //mapeamento
    public ClienteDTO findById(@PathVariable int idCliente){
        return this.clienteService.deleteById(idCliente);
    }


    //DELETE = DELETAR INFORMAÇÕEs
    @RequestMapping(value = "/deletarCliente/{idCliente}" , method = RequestMethod.DELETE) //mapeamento
    public ClienteDTO deleteById(@PathVariable int idCliente){
        return this.clienteService.deleteById(idCliente);
    }

    // PUT = ATUALIZAR INFORMAÇÕES
    @RequestMapping(value = "/atualizarCliente/{idCliente}", method = RequestMethod.PUT)
    public ClienteDTO updateByid(@PathVariable int idCliente, @RequestBody ClienteDTO dto){
        return this.clienteService.updateByid(idCliente,dto);
    }
}
