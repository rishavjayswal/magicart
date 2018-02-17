package com.magicart.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicart.poc.dao.ProductDAO;
import com.magicart.poc.entity.Product;
import com.magicart.poc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Override
	public List<Product> fetchAllProducts() {
		return productDAO.findAll();
	}

	@Override
	public Product fetchProductByProductId(Long productId) {
		return productDAO.findByProductId(productId);
	}
}
