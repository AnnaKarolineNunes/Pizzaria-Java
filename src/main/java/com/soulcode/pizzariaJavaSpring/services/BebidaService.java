package com.soulcode.pizzariaJavaSpring.services;


import com.soulcode.pizzariaJavaSpring.model.Bebida;
import com.soulcode.pizzariaJavaSpring.model.Cliente;
import com.soulcode.pizzariaJavaSpring.model.dtos.BebidaDTO;
import com.soulcode.pizzariaJavaSpring.model.dtos.ClienteDTO;
import com.soulcode.pizzariaJavaSpring.repositories.BebidaPedidaRepository;
import com.soulcode.pizzariaJavaSpring.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BebidaService {

    @Autowired
    private BebidaRepository bebidaRepository;

    public BebidaDTO save(BebidaDTO dto){
        Bebida bebida = BebidaDTO.convert(dto);
        bebida = this.bebidaRepository.save(bebida); // salvando no banco de dados
        return new BebidaDTO(bebida);
    }

    public List<BebidaDTO>findAll(){
        List<Bebida> bebidas = this.bebidaRepository.findAll();
        return bebidas.stream().map(BebidaDTO::new).collect(Collectors.toList());
    }

    public BebidaDTO findById(int idBebida){
        Optional<Bebida> resultado = this.bebidaRepository.findById(idBebida); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new BebidaDTO(resultado.get());
        }
    }

    public  BebidaDTO deleteById(int idBebida){
        BebidaDTO dto  = findById(idBebida);
        this.bebidaRepository.deleteById(idBebida);
        return dto;
    }

    public BebidaDTO updateById(int  idBebida, BebidaDTO dto){
        this.findById(idBebida); // buscar o cliente e ver se ele existe
        Bebida bebida = BebidaDTO.convert(dto);
        bebida.setIdBebida(idBebida);
        bebida = this.bebidaRepository.save(bebida);
        return new BebidaDTO(bebida);
    }



}
