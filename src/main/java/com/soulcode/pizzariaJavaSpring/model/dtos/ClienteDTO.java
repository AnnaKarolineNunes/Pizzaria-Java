package com.soulcode.pizzariaJavaSpring.model.dtos;

import com.soulcode.pizzariaJavaSpring.model.Cliente;
import lombok.Getter;
import lombok.Setter;

public class ClienteDTO {

    @Getter
    @Setter
    private int idCliente;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String telefone;

    @Getter
    @Setter
    private String endereco;

    @Getter
    @Setter
    private String login;

    @Getter
    @Setter
    private String senha;

    public ClienteDTO(){
    }

    public ClienteDTO(int idCliente) {
        this.idCliente = idCliente;
    }

    public ClienteDTO(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = cliente.getEndereco();
        this.login = cliente.getLogin();
        this.senha = cliente.getSenha();
    }

    public static Cliente convert(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setIdCliente(clienteDTO.getIdCliente());
        cliente.setNome(clienteDTO.getNome());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setEndereco(clienteDTO.getEndereco());
        cliente.setLogin(clienteDTO.getLogin());
        cliente.setSenha(clienteDTO.getSenha());
        return cliente;
    }
}
