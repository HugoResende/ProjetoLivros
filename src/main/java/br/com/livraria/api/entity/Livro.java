package br.com.livraria.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TBL_LIVRO")
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "livro_id")
	private Long id;

	@Column(name = "livro_nome")
	private String nome;
	
	@Column(name = "livro_descricao")
	private String descricao;
	
	@Column(name="livro_capa")
	private String capa;
		
	@Column(name = "livro_autor")
	private Autor autor;
		

}
