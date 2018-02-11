package com.magicart.poc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magicart.poc.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long>{

	List<Product> findAll();
}
