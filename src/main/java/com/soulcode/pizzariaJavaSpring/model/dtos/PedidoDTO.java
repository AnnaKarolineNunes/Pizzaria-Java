package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Cliente;
import com.soulcode.pizzariaJavaSpring.model.Fornada;
import com.soulcode.pizzariaJavaSpring.model.Pedido;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

public class PedidoDTO {

    @Getter
    @Setter
    private int idPedido;

    @Getter
    @Setter
    private Cliente cliente;

    @Getter
    @Setter
    private Fornada fornada;

    @Getter
    @Setter
    private Timestamp dataHora;

    public PedidoDTO(){
    }

    public PedidoDTO(int idPedido){
        this.idPedido = idPedido;
    }

    public PedidoDTO(Pedido pedido) {
        this.idPedido = pedido.getIdPedido();
        this.cliente = pedido.getCliente();
        this.fornada = pedido.getFornada();
        this.dataHora = pedido.getDataHora();
    }

    public static Pedido convert(PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido();
        pedido.setIdPedido(pedidoDTO.getIdPedido());
        pedido.setCliente(pedidoDTO.getCliente());
        pedido.setFornada(pedidoDTO.getFornada());
        pedido.setDataHora(pedidoDTO.getDataHora());
        return pedido;
    }
}
