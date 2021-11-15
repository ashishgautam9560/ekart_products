package com.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.ProductDTO;
import com.infy.dto.ProductSellerPriceDTO;
import com.infy.entity.Product;
import com.infy.entity.ProductSellerPrice;
import com.infy.repo.ProductRepository;
import com.infy.repo.ProductSellerRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductSellerRepository productSellerRepository;
	
	public List<ProductDTO> getAllProducts()
	{
		List<Product> productsList = this.productRepository.findAll();
		List<ProductDTO> productsDTO = new ArrayList<>();
		
		List<ProductSellerPrice> prodSellerList = this.productSellerRepository.findAll();
		List<ProductSellerPriceDTO> prodSellerListDTO = new ArrayList<>();
		
		for(Product p: productsList)
		{
			ProductDTO obj = new ProductDTO();
			obj.setProductName(p.getProductName());
			obj.setDescription(p.getDescription());
			obj.setCategory(p.getCategory());
			obj.setBrand(p.getBrand());
			obj.setPrice(p.getPrice());
			obj.setRecommendation(p.isRecommendation());
//			ProductSellerPrice obj1 
			
//			for(ProductSellerPrice psp: prodSellerList)
//			{
//				if(p.getProductID() == psp.getProductID())
//				{
//					ProductSellerPriceDTO obj1 = new ProductSellerPriceDTO();
//					obj1.setEmail(psp.getEmail());
//					obj1.setPrice(psp.getPrice());
//					
//					prodSellerListDTO.add(obj1);
//				}
//				obj.setAllSellersofProductList(prodSellerListDTO);
//			}
			
			
			productsDTO.add(obj);
		}
		return productsDTO;
	}
	
	
	// 1 -------
	public void addProduct(Product objProduct)
	{
		productRepository.save(objProduct);
	}	
	
	
	// 2 ------
	public List<ProductDTO> getProductOnDeals()
	{
		List<Product> productsList = this.productRepository.findAll();
		List<Product> productsDealsList = new ArrayList<>();
				
		for(Product p : productsList)
		{
			if(p.getDiscount() > 20)
				productsDealsList.add(p);
		}
		
		List<ProductDTO> productsDTO = new ArrayList<>();
		
		for(Product p : productsDealsList)
		{
			ProductDTO obj = new ProductDTO();
			obj.setProductName(p.getProductName());
			obj.setDescription(p.getDescription());
			obj.setCategory(p.getCategory());
			obj.setBrand(p.getBrand());
			obj.setPrice(p.getPrice());
			obj.setDiscount(p.getDiscount());
			
			productsDTO.add(obj);
		}
		
		return  productsDTO;
	}
	
	
	// 3 ------
	public List<ProductDTO> getRecommendedProducts()
	{
		List<Product> productsList = this.productRepository.findAll();
		List<ProductDTO> productRecommended = new ArrayList<>();
		
		for(Product p : productsList)
		{
			if(p.getDiscount()>20 && p.isRecommendation()==true)
			{
				ProductDTO objDto = new ProductDTO();
				objDto.setProductName(p.getProductName());
				objDto.setDescription(p.getDescription());
				objDto.setCategory(p.getCategory());
				objDto.setBrand(p.getBrand());
				objDto.setPrice(p.getPrice());
				
				productRecommended.add(objDto);
			}
		}
		
		return productRecommended;
	}
	
	
	// 4 ----------
	public Integer getProdIDbyProdName(String prodName)
	{
		Product objProduct = productRepository.findByProductName(prodName);
		return objProduct.getProductID();
	}
	
	
	// 5 ------
	public List<Product> get(String prodName)
	{
		return this.productRepository.findByProductNameContaining(prodName);
	}
}




















