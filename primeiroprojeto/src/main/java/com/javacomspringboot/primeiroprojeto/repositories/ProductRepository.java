package com.javacomspringboot.primeiroprojeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacomspringboot.primeiroprojeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

/*@Component
public class ProductRepository {
	
	private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}*/
