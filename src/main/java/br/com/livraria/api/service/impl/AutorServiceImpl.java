package br.com.livraria.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livraria.api.entity.Autor;
import br.com.livraria.api.repository.AutorRepository;
import br.com.livraria.api.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	

	public Autor create(Autor autor) {
		if(autor == null) {
			return null;
		}
		return this.repository.save(autor);
	}



	@Override
	public void delete(Autor autor) {
		this.repository.delete(autor);
	}
	
	
}
