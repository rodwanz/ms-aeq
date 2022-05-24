package com.wanzeler.crudarq.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.crudarq.entities.Produto;
import com.wanzeler.crudarq.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id){
		Produto obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}