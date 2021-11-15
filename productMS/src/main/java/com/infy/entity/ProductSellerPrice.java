package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ProductSellerPrice { 
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "product_id")
	private Integer productID;
	
	@Column(name = "seller_email")
	private String email;
	
	@Column(name = "price")
	private Integer price;

	
	// default
	public ProductSellerPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// parameterized
	public ProductSellerPrice(Integer id, Integer productID, String email, Integer price) {
		super();
		this.id = id;
		this.productID = productID;
		this.email = email;
		this.price = price;
	}
	
	
	// getters and setters
	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}















