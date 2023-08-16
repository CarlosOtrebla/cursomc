package com.carlosotrebla.cursomc.repositories;

import com.carlosotrebla.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
