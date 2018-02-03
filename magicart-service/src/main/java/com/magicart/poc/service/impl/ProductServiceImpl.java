package com.magicart.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicart.poc.dao.ProductDAO;
import com.magicart.poc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public String fetchAllProducts() {
		// TODO Auto-generated method stub
		return productDAO.fetchAllProducts();
	}
}
