package com.lg.ecommerce.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lg.ecommerce.entity.ProductEntity;
import com.lg.ecommerce.service.ProductService;
@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	

@GetMapping
public List<ProductEntity> getAllProducts() {
    return service.getAll();
}
	@PostMapping
	public ProductEntity create (@RequestBody ProductEntity product) {
		
		return service.save(product);
	}

}
