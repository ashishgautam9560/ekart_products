package com.infy.dto;

import java.util.List;

public class ProductDTO {

	private String productName;
	private String description;
	private String category;
	private String brand;
	private Integer price;
	private boolean recommendation;
	private Integer discount;
	
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
	private List<ProductSellerPriceDTO> allSellersofProductList;
	
	
	
	public List<ProductSellerPriceDTO> getAllSellersofProductList() {
		return allSellersofProductList;
	}

	public void setAllSellersofProductList(List<ProductSellerPriceDTO> allSellersofProductList) {
		this.allSellersofProductList = allSellersofProductList;
	}

	// default
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// parameterized
	public ProductDTO(String productName, String description, String category, String brand, Integer price) {
		super();
		this.productName = productName;
		this.description = description;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	
	// getters and setters
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
}
