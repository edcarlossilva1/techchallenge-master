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

import br.com.fiap.techchellenge.entities.Endereco;
import br.com.fiap.techchellenge.repository.EnderecoRepository;

	@RestController
	@RequestMapping(value = "/endereco")
	public class EnderecoController {
		@Autowired
		private EnderecoRepository repository; 
		
		@GetMapping  //end point 
		public List<Endereco> findAll(){
			List<Endereco> result = repository.findAll();
			return result;
		}
		
		@GetMapping(value = "/{id}")  //end point 
		public Endereco findByid(@PathVariable Long id){
			Endereco result = repository.findById(id).get();
			return result;
		}
		
		@PostMapping(value = "/{id}")  //end point 
		public Endereco insert(@RequestBody Endereco endereco){
			Endereco result = repository.save(endereco);
			return result;
		}
		
		 @PutMapping
		    public Endereco update(@RequestBody Endereco endereco) {
			 Endereco result = repository.saveAndFlush(endereco);
		    return result;
		  }

	}
