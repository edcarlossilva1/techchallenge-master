package br.com.fiap.techchellenge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_eletrodomestico")
public class Eletrodomestico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	private double potencia;
	private int tempo;
	private double consumo;
	
	public Eletrodomestico() {

	}
   
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
	// Cliente cliente = new cliente();
	
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

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	/*
	public boolean calculaConsumo (int tempo) {
	   	if (tempo > 0 ) {
	   		this.consumo = this.potencia/1.000 * tempo;
	   		return true;
	   	} 
	   	return false;
	}*/
}
