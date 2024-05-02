package com.soulcode.pizzariaJavaSpring.repositories;

import com.soulcode.pizzariaJavaSpring.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
