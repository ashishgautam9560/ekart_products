package com.infy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.ProductSellerPrice;

@Repository
public interface ProductSellerRepository extends JpaRepository<ProductSellerPrice, Integer> {
	List<ProductSellerPrice> findByProductID(Integer productID);
}
