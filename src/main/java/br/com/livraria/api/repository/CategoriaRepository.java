package br.com.livraria.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.api.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	
}

