package br.com.fiap.techchellenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.techchellenge.entities.Cliente;
import br.com.fiap.techchellenge.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository repository; 
	
	@GetMapping  //end point 
	public List<Cliente> findAll(){
		List<Cliente> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")  //end point 
	public Cliente findByid(@PathVariable Long id){
		Cliente result = repository.findById(id).get();
		return result;
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
