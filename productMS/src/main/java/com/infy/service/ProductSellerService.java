package com.infy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.ProductSellerPriceDTO;
import com.infy.entity.ProductSellerPrice;
import com.infy.repo.ProductSellerRepository;


@Service
public class ProductSellerService {

	@Autowired
	ProductSellerRepository productSellerRepository;
	
	// 1 ------
	public void addRecord(ProductSellerPrice objProductSellerPrice)
	{
		this.productSellerRepository.save(objProductSellerPrice);
	}
	
	// 2 -------
	public List<ProductSellerPriceDTO> getPricefromAllSellers(Integer prodId)
	{
		List<ProductSellerPrice> list = productSellerRepository.findAll();
		List<ProductSellerPriceDTO> listDTO = new ArrayList<>();
		
		for(ProductSellerPrice p : list)
		{
			if(p.getProductID() == prodId)
			{
				ProductSellerPriceDTO objDto = new ProductSellerPriceDTO();
				objDto.setEmail(p.getEmail());
				objDto.setPrice(p.getPrice());
				
				listDTO.add(objDto);
			}
		}
		
		return listDTO;
	}
	
}






