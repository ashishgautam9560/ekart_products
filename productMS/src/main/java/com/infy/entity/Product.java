package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@Column(name = "product_id")
	private Integer productID;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "brand_name")
	private String brand;
	
	@Column(name = "actual_price")
	private Integer price;
	
	@Column(name = "discount")
	private Integer discount;
	
	@Column(name = "recommendation")
	private boolean recommendation;

	
	// default
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	// parameterized
	public Product(Integer productID, String productName, String description, String category, String brand,
			Integer price, Integer discount, boolean recommendation) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.recommendation = recommendation;
	}



	// getters and setters
	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public boolean isRecommendation() {
		return recommendation;
	}

	public void setRecommendation(boolean recommendation) {
		this.recommendation = recommendation;
	}
}