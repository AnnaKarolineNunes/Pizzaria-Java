package com.soulcode.pizzariaJavaSpring.services;


import com.soulcode.pizzariaJavaSpring.model.Cliente;
import com.soulcode.pizzariaJavaSpring.model.Pedido;
import com.soulcode.pizzariaJavaSpring.model.dtos.ClienteDTO;
import com.soulcode.pizzariaJavaSpring.model.dtos.PedidoDTO;
import com.soulcode.pizzariaJavaSpring.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoDTO save(PedidoDTO dto){
        Pedido pedido = PedidoDTO.convert(dto);
        pedido = this.pedidoRepository.save(pedido);
        return new PedidoDTO(pedido);
    }

    public List<PedidoDTO> findAll(){
        List<Pedido> pedidos = this.pedidoRepository.findAll();
        return pedidos.stream().map(PedidoDTO::new).collect(Collectors.toList());
    }

    public  PedidoDTO findById(int idPedido){
        Optional<Pedido> resultado = this.pedidoRepository.findById(idPedido);
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new PedidoDTO(resultado.get());
        }
    }

    public PedidoDTO deleteById(int idPedido){
        PedidoDTO dto = findById(idPedido);
        this.pedidoRepository.deleteById(idPedido); // deletando pelo id no banco de dados
        return dto;
    }
    public PedidoDTO updateByid(int idPedido, PedidoDTO dto){
        this.findById(idPedido); // buscar o cliente e ver se ele existe
        Pedido pedido = PedidoDTO.convert(dto);
        pedido.setIdPedido(idPedido);
        pedido = this.pedidoRepository.save(pedido);
        return new PedidoDTO(pedido);
    }


}
