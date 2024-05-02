package com.soulcode.pizzariaJavaSpring.repositories;

import com.soulcode.pizzariaJavaSpring.model.Tamanho;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TamanhoRepository extends JpaRepository<Tamanho, Integer> {
}
