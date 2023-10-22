package com.javacomspringboot.primeiroprojeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacomspringboot.primeiroprojeto.entities.Product;
import com.javacomspringboot.primeiroprojeto.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = categoryRepository.findById(id).get();	
		return ResponseEntity.ok().body(cat);
	}
	
	/*@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1L, "Elevtronics"));
		list.add(new Product(2L, "Bs"));
		return ResponseEntity.ok().body(list);
	}*/
	
	/*@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = new Product(1L, "Electronics");
		return ResponseEntity.ok().body(cat);
	}*/
	
}






































