package com.matrix.ProductControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrix.Models.Product;
import com.matrix.ProductServices.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome to Matrix API";
	}
	
	@RequestMapping("/getProductList")
	public List<Product> getProductList() {
		
		return service.getProductList();
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}
	
	
}
