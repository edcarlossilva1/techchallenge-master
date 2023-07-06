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

import br.com.fiap.techchellenge.entities.Eletrodomestico;
import br.com.fiap.techchellenge.repository.EletrodomesticoRepository;

	@RestController
	@RequestMapping(value = "/eletro")
	public class EletrodomesticoController {
		@Autowired
		private EletrodomesticoRepository repository; 
		
		@GetMapping  //end point 
		public List<Eletrodomestico> findAll(){
			List<Eletrodomestico> result = repository.findAll();
			return result;
		}
		
		@GetMapping(value = "/{id}")  //end point 
		public Eletrodomestico findByid(@PathVariable Long id){
			Eletrodomestico result = repository.findById(id).get();
			return result;
		}
		
		@PostMapping(value = "/{id}")  //end point 
		public Eletrodomestico insert(@RequestBody Eletrodomestico eletrodomestico){
			Eletrodomestico result = repository.save(eletrodomestico);
			return result;
		}
		
		 @PutMapping
		    public Eletrodomestico  update(@RequestBody Eletrodomestico eletrodomestico) {
		    Eletrodomestico  result = repository.saveAndFlush(eletrodomestico);
		    return result;
		  }

	}


