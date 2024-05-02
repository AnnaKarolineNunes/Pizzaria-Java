package com.soulcode.pizzariaJavaSpring.repositories;

import com.soulcode.pizzariaJavaSpring.model.Cliente;
import com.soulcode.pizzariaJavaSpring.model.PizzaPedida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaPedidaRepository extends JpaRepository<PizzaPedida, Integer> {
}
