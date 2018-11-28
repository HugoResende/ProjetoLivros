package br.com.livraria.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.livraria.api.entity.Autor;
import br.com.livraria.api.repository.AutorRepository;
import br.com.livraria.api.service.AutorService;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	@Autowired
	private AutorService service;
	
	@Autowired
	private AutorRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Autor autor = new Autor();
		autor.setNome("Hugo");
		service.create(autor);
		Autor autor2 = new Autor();
		autor2.setNome("Bruno");
		service.create(autor2);
		
		service.delete(autor2);

	}
}
