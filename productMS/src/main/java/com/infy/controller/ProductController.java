package com.infy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.ProductDTO;
import com.infy.dto.ProductSellerPriceDTO;
import com.infy.entity.Product;
import com.infy.service.ProductSellerService;
import com.infy.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping(value = "/products")
public class ProductController 
{
	@Autowired
	ProductSellerService productSellerService;
	
	@Autowired
	ProductService productService;
	
	// 1) search bar
	// 2) deals (T)
	// 3) recommended (T)
	// 4) click on product
	// 5) price from all sellers (T)
	
	
	@GetMapping(value = "/getAll")
	public List<ProductDTO> getAllProducts()
	{
		List<ProductDTO> productsDTOList = this.productService.getAllProducts();
		
		for(ProductDTO p: productsDTOList)
		{
			List<ProductSellerPriceDTO> productSellerDTOList = this.getPricefromAllSellers(p.getProductName());
			
			p.setAllSellersofProductList(productSellerDTOList);
		}
		
		return productsDTOList;
	}
	
	// 2)
	@GetMapping(value = "/getDealProducts")
	public List<ProductDTO> getProductOnDeals()
	{
		return this.productService.getProductOnDeals();
	}
	
	
	// 3)
	@GetMapping(value = "/getReccomendedProducts")
	public List<ProductDTO> getRecommendedProducts()
	{
		return this.productService.getRecommendedProducts();
	}
	
	
	// 5)
	@GetMapping(value = "/getPricefromAllSellers")
	public List<ProductSellerPriceDTO> getPricefromAllSellers(@RequestParam String prodName)
	{
		Integer id = this.productService.getProdIDbyProdName(prodName);
		return this.productSellerService.getPricefromAllSellers(id);
	}
	
	
	// 4 ----
	@GetMapping(value = "/getbyName")
	public List<Product> getAllcontaining(@RequestParam(required = false) String prodName)
	{
		return this.productService.get(prodName);
	}
	
	
//	 public List<Post> list(@RequestParam(required = false) String title) {
//        if (StringUtils.isEmpty(title)) {
//            return postService.getAll();
//        }
//        return postService.findByTitle(title);
//    }
	
}











