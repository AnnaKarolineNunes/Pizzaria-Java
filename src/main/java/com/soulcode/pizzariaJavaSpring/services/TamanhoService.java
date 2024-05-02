package com.soulcode.pizzariaJavaSpring.services;

import com.soulcode.pizzariaJavaSpring.model.Tamanho;
import com.soulcode.pizzariaJavaSpring.model.dtos.TamanhoDTO;
import com.soulcode.pizzariaJavaSpring.repositories.TamanhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TamanhoService {

    @Autowired
    private TamanhoRepository tamanhoRepository;

    public TamanhoDTO save(TamanhoDTO dto){
        Tamanho tamanho = TamanhoDTO.convert(dto);
        tamanho = this.tamanhoRepository.save(tamanho); // salvando no banco de dados
        return new TamanhoDTO(tamanho);
    }

    public List<TamanhoDTO> findAll(){
        List<Tamanho> tamanhos = this.tamanhoRepository.findAll(); // buscando no banco de dados
        return tamanhos.stream().map(TamanhoDTO::new).collect(Collectors.toList());
    }

    public TamanhoDTO findById(int idTamanho){
        Optional<Tamanho> resultado = this.tamanhoRepository.findById(idTamanho); // procurando o id no banco de dados
        if(resultado.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else {
            return new TamanhoDTO(resultado.get());
        }
    }

    public TamanhoDTO deleteById(int idTamanho){
        TamanhoDTO dto = findById(idTamanho);
        this.tamanhoRepository.deleteById(idTamanho); // deletando pelo id no banco de dados
        return dto;
    }
    public TamanhoDTO updateByid(int idTamanho, TamanhoDTO dto){
        this.findById(idTamanho);
        Tamanho tamanho = TamanhoDTO.convert(dto);
        tamanho.setIdTamanho(idTamanho);
        tamanho = this.tamanhoRepository.save(tamanho);
        return new  TamanhoDTO(tamanho);
    }

}
