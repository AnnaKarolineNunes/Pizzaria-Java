package com.soulcode.pizzariaJavaSpring.repositories;

import com.soulcode.pizzariaJavaSpring.model.BebidaPedida;
import com.soulcode.pizzariaJavaSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidaPedidaRepository extends JpaRepository<BebidaPedida, Long> {
}
