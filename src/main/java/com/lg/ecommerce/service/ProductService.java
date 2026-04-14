package com.lg.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lg.ecommerce.entity.ProductEntity;
import com.lg.ecommerce.repository.ProductRepository;
@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public ProductEntity save(ProductEntity product) {
		return repo.save(product);
	}
	
	
	public List<ProductEntity> getAll() {
	    return repo.findAll();
	}

}
