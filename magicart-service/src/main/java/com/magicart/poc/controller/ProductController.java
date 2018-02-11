package com.magicart.poc.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magicart.poc.entity.Product;
import com.magicart.poc.service.ProductService;

@RestController
@RequestMapping(path="/product")
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> fetchAllProducts(HttpServletResponse response) {
		return new ResponseEntity<List<Product>>(productService.fetchAllProducts(), HttpStatus.OK);
	}
	
	static {
		System.out.println("********Controller bean****************");
	}
	
}
