package br.com.fiap.techchellenge.dto;

import br.com.fiap.techchellenge.entities.Endereco;

public class EnderecoDTO {
	private Long id;
	private String rua;

	public EnderecoDTO() {
	}

	public EnderecoDTO(Long id, String rua) {
		this.id = id;
		this.rua = rua;
	}

	// FAZER UM MAPEAMENTO ATRAVES DO CRONSTUTOR DA ENTIDADE PARA O DTO
	public EnderecoDTO(Endereco endereco) {
		this.id = endereco.getId();
		this.rua = endereco.getRua();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}
