package br.com.livraria.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livraria.api.entity.Categoria;
import br.com.livraria.api.repository.CategoriaRepository;
import br.com.livraria.api.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;

	@Override
	public Categoria create(Categoria categoria) {
		return this.repository.save(categoria);
	}

}
