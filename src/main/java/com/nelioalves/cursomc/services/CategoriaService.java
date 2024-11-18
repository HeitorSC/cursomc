package com.nelioalves.cursomc.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Categoria obj = repo.findById(id).orElse(null);

        return obj;
    }

    public List<Categoria> buscarTodos(){
        List<Categoria> obj = repo.findAll();

        return obj;
    }

    public List<Categoria> buscarPorNome(String nome){
        List<Categoria> obj = repo.findAll();
        List<Categoria> obj2 = new ArrayList<>();
        for (int i = 0; i < obj.size(); i++){
            if (obj.get(i).getNome().equals(nome)){
                obj2.add(obj.get(i));
                System.out.println(obj.get(i));
            }
        }
            System.out.println(nome);
            System.out.println(obj2);
            
        return obj2;
    }
}
