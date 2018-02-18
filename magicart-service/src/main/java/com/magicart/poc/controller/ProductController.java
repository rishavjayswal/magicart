package com.magicart.poc.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.magicart.poc.entity.Product;
import com.magicart.poc.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@GetMapping(path="/products")
	public ResponseEntity<List<Product>> fetchAllProducts(HttpServletResponse response) {
		return new ResponseEntity<List<Product>>(productService.fetchAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping(path="/product/{productId}")
	public ResponseEntity<Product> fetchProductByProductId(@PathVariable Long productId, HttpServletResponse response) {
		return new ResponseEntity<Product>(productService.fetchProductByProductId(productId), HttpStatus.OK);
	}
	
}
