package br.com.livraria.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.api.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
}
