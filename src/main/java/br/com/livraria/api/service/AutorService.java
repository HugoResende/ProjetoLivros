package br.com.livraria.api.service;

import br.com.livraria.api.entity.Autor;

public interface AutorService {
	Autor create(Autor autor);
	
	void delete(Autor autor);
}
