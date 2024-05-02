package com.soulcode.pizzariaJavaSpring.repositories;

import com.soulcode.pizzariaJavaSpring.model.Bebida;
import com.soulcode.pizzariaJavaSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidaRepository extends JpaRepository<Bebida, Integer> {
}
