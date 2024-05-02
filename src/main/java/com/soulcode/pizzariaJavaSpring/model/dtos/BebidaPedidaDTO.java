package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Bebida;
import com.soulcode.pizzariaJavaSpring.model.BebidaPedida;
import com.soulcode.pizzariaJavaSpring.model.Pedido;
import lombok.Getter;
import lombok.Setter;
public class BebidaPedidaDTO {

    @Getter
    @Setter
    private long idBebidaPedida;

    @Getter
    @Setter
    private Bebida bebida;

    @Getter
    @Setter
    private Pedido pedido;

    @Getter
    @Setter
    private int quantidade;

    public BebidaPedidaDTO(){
    }

    public BebidaPedidaDTO(long idBebidaPedida){
        this.idBebidaPedida = idBebidaPedida;
    }

    public BebidaPedidaDTO(BebidaPedida bebidaPedida) {
        this.idBebidaPedida = bebidaPedida.getIdBebidaPedida();
        this.bebida = bebidaPedida.getBebida();
        this.pedido = bebidaPedida.getPedido();
        this.quantidade = bebidaPedida.getQuantidade();
    }

    public static BebidaPedida convert(BebidaPedidaDTO bebidaPedidaDTO){
        BebidaPedida bebidaPedida = new BebidaPedida();
        bebidaPedida.setIdBebidaPedida(bebidaPedidaDTO.getIdBebidaPedida());
        bebidaPedida.setBebida(bebidaPedidaDTO.bebida);
        bebidaPedida.setPedido(bebidaPedidaDTO.getPedido());
        bebidaPedida.setQuantidade(bebidaPedidaDTO.getQuantidade());
        return bebidaPedida;
    }
}
