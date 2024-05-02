package com.soulcode.pizzariaJavaSpring.services;

import com.soulcode.pizzariaJavaSpring.model.PizzaPedida;
import com.soulcode.pizzariaJavaSpring.model.dtos.PizzaPedidaDTO;
import com.soulcode.pizzariaJavaSpring.repositories.PizzaPedidaRepository;
import com.soulcode.pizzariaJavaSpring.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PizzaPedidaService {

    @Autowired
    private PizzaPedidaRepository pizzaPedidaRepository;

    public PizzaPedidaDTO save(PizzaPedidaDTO dto){
        PizzaPedida pizzaPedida = PizzaPedidaDTO.convert(dto);
        pizzaPedida = this.pizzaPedidaRepository.save(pizzaPedida); // salvando no banco de dados
        return new PizzaPedidaDTO(pizzaPedida);
    }

    public List<PizzaPedidaDTO> findAll(){
        List<PizzaPedida> pizzaPedidas = this.pizzaPedidaRepository.findAll(); // buscando no banco de dados
        return pizzaPedidas.stream().map(PizzaPedidaDTO::new).collect(Collectors.toList());
    }

    public PizzaPedidaDTO findById(int idPizzaPedida){
        Optional<PizzaPedida> resultado = this.pizzaPedidaRepository.findById(idPizzaPedida); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new PizzaPedidaDTO(resultado.get());
        }
    }

    public PizzaPedidaDTO deleteById(int idPizzaPedida){
        PizzaPedidaDTO dto = findById(idPizzaPedida);
        this.pizzaPedidaRepository.deleteById(idPizzaPedida); // deletando pelo id no banco de dados
        return dto;
    }
    public PizzaPedidaDTO updateByid(int idPizzaPedida, PizzaPedidaDTO dto){
        this.findById(idPizzaPedida);
        PizzaPedida pizzaPedida = PizzaPedidaDTO.convert(dto);
        pizzaPedida.setIdPizzaPedida(idPizzaPedida);
        pizzaPedida = this.pizzaPedidaRepository.save(pizzaPedida);
        return new  PizzaPedidaDTO(pizzaPedida);
    }
}
