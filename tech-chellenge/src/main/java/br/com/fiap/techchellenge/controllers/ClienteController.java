package br.com.fiap.techchellenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.techchellenge.entities.Cliente;
import br.com.fiap.techchellenge.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository repository; 
	/*
	@GetMapping  //end point 
	public List<Cliente> findAll(){
		List<Cliente> result = repository.findAll();
		return result;
	}*/
	
	@GetMapping
	public ResponseEntity<Page<Cliente>> findAll(@RequestParam(value = "pagina", defaultValue = "0") Integer pagina,
			@RequestParam(value = "quantidade", defaultValue = "10") Integer quantidade,
			@RequestParam(value = "dierecao", defaultValue = "DESC") String direcao,
			@RequestParam(value = "ordenacao", defaultValue = "nome") String ordenacao) {
		PageRequest pageRequest = PageRequest.of(pagina, quantidade, Sort.Direction.valueOf(direcao), ordenacao);
		var list = repository.findAll(pageRequest);
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable long id) {
		Cliente cliente = repository.findById(id).get();
		return ResponseEntity.ok(cliente);
	}
	
	
	@PostMapping(value = "/{id}")  //end point 
	public Cliente insert(@RequestBody Cliente cliente){
		Cliente result = repository.save(cliente);
		return result;
	}
	
	 @PutMapping
	    public Cliente update(@RequestBody Cliente cliente) {
	    Cliente result = repository.saveAndFlush(cliente);
		return result;
	}

}
