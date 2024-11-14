package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria c1 = new Categoria(1, "Informática");
        Categoria c2 = new Categoria(2, "Contabilidade");

        List<Categoria> lista = new ArrayList<>();

        lista.add(c1);
        lista.add(c2);

        return lista;
    }    
}
