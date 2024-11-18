package com.nelioalves.cursomc.resources;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

    @Autowired
    private CategoriaService service;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos(){
        List<Categoria> obj = service.buscarTodos();

        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarId(@PathVariable Integer id){

        Categoria obj = service.buscar(id);
        
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/nome/{nome}", method=RequestMethod.GET)  
    public ResponseEntity<?> buscarPorNome(@PathVariable String nome){
        List<Categoria> obj = service.buscarPorNome(nome);

        return ResponseEntity.ok().body(obj);
    }
}