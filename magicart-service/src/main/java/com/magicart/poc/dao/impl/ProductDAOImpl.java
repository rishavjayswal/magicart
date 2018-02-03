package com.magicart.poc.dao.impl;

import org.springframework.stereotype.Repository;

import com.magicart.poc.dao.ProductDAO;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Override
	public String fetchAllProducts() {
		return "ProductList";
	}
}
