package com.soulcode.pizzariaJavaSpring.services;

import com.soulcode.pizzariaJavaSpring.model.Ingrediente;
import com.soulcode.pizzariaJavaSpring.model.dtos.IngredienteDTO;
import com.soulcode.pizzariaJavaSpring.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public IngredienteDTO save(IngredienteDTO dto){
        Ingrediente ingrediente = IngredienteDTO.convert(dto);
        ingrediente = this.ingredienteRepository.save(ingrediente); // salvando no banco de dados
        return new IngredienteDTO(ingrediente);
    }

    public List<IngredienteDTO> findAll(){
        List<Ingrediente> ingredientes = this.ingredienteRepository.findAll(); // buscando no banco de dados
        return ingredientes.stream().map(IngredienteDTO::new).collect(Collectors.toList());
    }

    public IngredienteDTO findById(int idIngrediente){
        Optional<Ingrediente> resultado = this.ingredienteRepository.findById(idIngrediente); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new IngredienteDTO(resultado.get());
        }
    }

    public IngredienteDTO deleteById(int idIngrediente){
        IngredienteDTO dto = findById(idIngrediente);
        this.ingredienteRepository.deleteById(idIngrediente); // deletando pelo id no banco de dados
        return dto;
    }
    public IngredienteDTO updateByid(int idIngrediente, IngredienteDTO dto){
        this.findById(idIngrediente);
        Ingrediente ingrediente = IngredienteDTO.convert(dto);
        ingrediente.setIdIngrediente(idIngrediente);
        ingrediente = this.ingredienteRepository.save(ingrediente);
        return new  IngredienteDTO(ingrediente);
    }

}
