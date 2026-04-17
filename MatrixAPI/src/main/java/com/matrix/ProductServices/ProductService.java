package com.matrix.ProductServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.matrix.Models.Product;

@Service
public class ProductService {

	private List<Product> products = new ArrayList<>();
	
	public List<Product> getProductbyID() {
		
		return products;
	}
	
	public Product addProduct(Product product) {
		
		products.add(product);
		return product;
	}
	
	public List<Product> getProductList() {
		
		return products;
	}
	
}
