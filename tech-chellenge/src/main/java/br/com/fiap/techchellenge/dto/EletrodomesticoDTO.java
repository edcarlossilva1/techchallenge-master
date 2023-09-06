package br.com.fiap.techchellenge.dto;

import br.com.fiap.techchellenge.entities.Eletrodomestico;

public class EletrodomesticoDTO {
	private Long id;
	private String modelo;

	public EletrodomesticoDTO() {
	}

	public EletrodomesticoDTO(Long id, String modelo) {
		this.id = id;
		this.modelo = modelo;
	}

	// FAZER UM MAPEAMENTO ATRAVES DO CRONSTUTOR DA ENTIDADE PARA O DTO
	public EletrodomesticoDTO(Eletrodomestico eletrodomestico) {
		this.id = eletrodomestico.getId();
		this.modelo = eletrodomestico.getModelo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
