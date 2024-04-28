package com.heitormendes.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heitormendes.cursomc.domain.Categoria;
import com.heitormendes.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;

//	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Categoria obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> find() {

		List<Categoria> obj = service.findAll();
		
		return ResponseEntity.ok().body(obj);
	}
}
