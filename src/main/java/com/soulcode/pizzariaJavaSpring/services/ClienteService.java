package com.soulcode.pizzariaJavaSpring.services;

import com.soulcode.pizzariaJavaSpring.model.Cliente;
import com.soulcode.pizzariaJavaSpring.model.dtos.ClienteDTO;
import com.soulcode.pizzariaJavaSpring.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO save( ClienteDTO dto){
        Cliente cliente = ClienteDTO.convert(dto);
        cliente = this.clienteRepository.save(cliente); // salvando no banco de dados
        return new ClienteDTO(cliente);
    }

    public List<ClienteDTO> findAll(){
        List<Cliente> clientes = this.clienteRepository.findAll(); // buscando no banco de dados
        return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }

    public ClienteDTO findById(int idCliente){
        Optional<Cliente> resultado = this.clienteRepository.findById(idCliente); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new ClienteDTO(resultado.get());
        }
    }

    public ClienteDTO deleteById(int idCliente){
        ClienteDTO dto = findById(idCliente);
        this.clienteRepository.deleteById(idCliente); // deletando pelo id no banco de dados
        return dto;
    }
    public ClienteDTO updateByid(int idCliente, ClienteDTO dto){
        this.findById(idCliente); // buscar o cliente e ver se ele existe
        Cliente cliente = ClienteDTO.convert(dto);
        cliente.setIdCliente(idCliente);
        cliente = this.clienteRepository.save(cliente);
        return new  ClienteDTO(cliente);
    }
}
