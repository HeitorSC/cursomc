package com.heitormendes.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heitormendes.cursomc.domain.Categoria;
import com.heitormendes.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
	
	public List<Categoria> findAll() {
		
		List<Categoria> obj = repo.findAll();
		
		for(int x=1; x <= obj.size(); x++) {
			System.out.println(x);
			System.out.println(obj.get(x-1).getNome());
		}
		
		return obj;
	}
	
}