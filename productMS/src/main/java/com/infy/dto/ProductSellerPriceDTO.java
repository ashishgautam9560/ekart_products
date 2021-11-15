package com.infy.dto;


public class ProductSellerPriceDTO {

	private String email;
	private Integer price;
	
	// default
	public ProductSellerPriceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// parameterized
	public ProductSellerPriceDTO(String email, Integer price) {
		super();
		this.email = email;
		this.price = price;
	}
	
	
	// getters and setters
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
