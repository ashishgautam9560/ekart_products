package com.infy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public Product findByProductName(String productName);
	
	public List<Product> findByProductNameContaining(String productName);
}
