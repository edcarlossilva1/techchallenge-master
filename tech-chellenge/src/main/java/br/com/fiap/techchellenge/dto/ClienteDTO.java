package br.com.fiap.techchellenge.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.com.fiap.techchellenge.entities.Cliente;
import br.com.fiap.techchellenge.entities.Endereco;

public class ClienteDTO {
	private Long id;
	private String nome;

	private List<EnderecoDTO> endereco = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ClienteDTO() {
	}

	public ClienteDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	// FAZER UM MAPEAMENTO ATRAVES DO CRONSTUTOR DA ENTIDADE PARA O DTO
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		// this.endereco = cliente.getEndereco();

	}

	public ClienteDTO(Cliente cliente, Set<Endereco> enderecos) {
		this(cliente);
		enderecos.forEach(endereco -> this.endereco.add(new EnderecoDTO(endereco)));
	}

	public List<EnderecoDTO> getEndereco() {
		return endereco;
	}

}
