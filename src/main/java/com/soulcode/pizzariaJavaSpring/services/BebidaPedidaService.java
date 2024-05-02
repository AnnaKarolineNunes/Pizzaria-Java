package com.soulcode.pizzariaJavaSpring.services;


import com.soulcode.pizzariaJavaSpring.model.BebidaPedida;
import com.soulcode.pizzariaJavaSpring.model.dtos.BebidaPedidaDTO;
import com.soulcode.pizzariaJavaSpring.repositories.BebidaPedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BebidaPedidaService {

    @Autowired
    private BebidaPedidaRepository bebidaPedidaRepository;

    public BebidaPedidaDTO save(BebidaPedidaDTO dto){
        BebidaPedida bebidaPedida = BebidaPedidaDTO.convert(dto);
        bebidaPedida = this.bebidaPedidaRepository.save(bebidaPedida); // salvando no banco de dados
        return new BebidaPedidaDTO(bebidaPedida);
    }

    public List<BebidaPedidaDTO> findAll(){
        List<BebidaPedida> clientes = this.bebidaPedidaRepository.findAll(); // buscando no banco de dados
        return clientes.stream().map(BebidaPedidaDTO::new).collect(Collectors.toList());
    }

    public BebidaPedidaDTO findById(long idBebidaPedida){
        Optional<BebidaPedida> resultado = this.bebidaPedidaRepository.findById(idBebidaPedida); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new BebidaPedidaDTO(resultado.get());
        }
    }

    public BebidaPedidaDTO deleteById(long idBebidaPedida){
        BebidaPedidaDTO dto = findById(idBebidaPedida);
        this.bebidaPedidaRepository.deleteById(idBebidaPedida); // deletando pelo id no banco de dados
        return dto;
    }
    public BebidaPedidaDTO updateByid(long idBebidaPedida, BebidaPedidaDTO dto){
        this.findById(idBebidaPedida);
        BebidaPedida bebidaPedida = BebidaPedidaDTO.convert(dto);
        bebidaPedida.setIdBebidaPedida(idBebidaPedida);
        bebidaPedida = this.bebidaPedidaRepository.save(bebidaPedida);
        return new  BebidaPedidaDTO(bebidaPedida);
    }


}
