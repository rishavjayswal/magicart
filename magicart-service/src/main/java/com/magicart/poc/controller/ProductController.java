package com.magicart.poc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magicart.poc.service.ProductService;

@RestController
@RequestMapping(path="/product")
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public String fetchAllProducts(HttpServletResponse response) {
		System.out.println("a");
		return productService.fetchAllProducts();
	}
	
	static {
		System.out.println("********Controller bean****************");
	}
	
}
