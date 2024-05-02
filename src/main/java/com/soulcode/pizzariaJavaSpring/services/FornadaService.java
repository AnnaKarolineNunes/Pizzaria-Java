package com.soulcode.pizzariaJavaSpring.services;

import com.soulcode.pizzariaJavaSpring.model.Fornada;
import com.soulcode.pizzariaJavaSpring.model.dtos.FornadaDTO;
import com.soulcode.pizzariaJavaSpring.repositories.FornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FornadaService {

    @Autowired
    FornadaRepository fornadaRepository;

    public FornadaDTO save(FornadaDTO dto){
        Fornada fornada = FornadaDTO.convert(dto);
        fornada = this.fornadaRepository.save(fornada); // salvando no banco de dados
        return new FornadaDTO(fornada);
    }

    public List<FornadaDTO> findAll(){
        List<Fornada> fornadas = this.fornadaRepository.findAll(); // buscando no banco de dados
        return fornadas.stream().map(FornadaDTO::new).collect(Collectors.toList());
    }

    public FornadaDTO findById(int idFornada){
        Optional<Fornada> resultado = this.fornadaRepository.findById(idFornada); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new FornadaDTO(resultado.get());
        }
    }

    public FornadaDTO deleteById(int idFornada){
        FornadaDTO dto = findById(idFornada);
        this.fornadaRepository.deleteById(idFornada); // deletando pelo id no banco de dados
        return dto;
    }
    public FornadaDTO updateByid(int idFornada, FornadaDTO dto){
        this.findById(idFornada); // buscar o cliente e ver se ele existe
        Fornada fornada = FornadaDTO.convert(dto);
        fornada.setIdFornada(idFornada);
        fornada = this.fornadaRepository.save(fornada);
        return new  FornadaDTO(fornada);
    }
}
