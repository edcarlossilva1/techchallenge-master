package br.com.fiap.techchellenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.techchellenge.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
