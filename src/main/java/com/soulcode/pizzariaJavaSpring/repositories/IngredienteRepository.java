package com.soulcode.pizzariaJavaSpring.repositories;

import com.soulcode.pizzariaJavaSpring.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository  extends JpaRepository<Ingrediente, Integer> {
}
