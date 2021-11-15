package com.infy.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.infy.entity.Product;
import com.infy.service.ProductService;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	ProductService productService;
	
	@Override
	public void run(String... args) throws Exception {

		Product objProduct1 = new Product(1,"Acer Predator Helios 300", "Acer Predator Helios "
				+ "300 is a Windows 10 Home laptop with a 17.30-inch display that has a "
				+ "resolution of 1920x1080 pixels. It is powered by a Core i7 processor ", 
				"Laptop", "ACER", 65000, 20, false);
		
		
		Product objProduct2 = new Product(2,"Dell P series P2419H", "The Dell S Series monitors come "
				+ "with Image Enhance feature that deliver enhanced picture quality and colour "
				+ "producing razor-sharp images with crisp edges and fine details. The panels of ", 
				"Desktop", "DELL", 21000, 30, true);

		
		Product objProduct3 = new Product(3,"Poco F1", "Poco is a sub-brand from Xiaomi that "
				+ "has launched the F1 as its first offering in the country. It has a 6.18-inch "
				+ "display with an 18.7:9 aspect ratio and Corning Gorilla Glass 3 protection ", 
				"Mobile", "POCO", 16000, 10, false);

		
		Product objProduct4 = new Product(4,"Dell Lattitude 15", "Dell Latitude 15 3000 5580 is a "
				+ "Windows 10 laptop with a 15.60-inch display that has a resolution of 1366x768 "
				+ "pixels. It is powered by a Core i5 processor and it comes with 8GB of RAM. ", 
				"Laptop", "DELL", 68000, 18, false);

		
		Product objProduct5 = new Product(5,"Acer Nitro 5", "Acer Nitro 5 (Intel) is a Windows 10 Home laptop with "
				+ "a 15.60-inch display that has a resolution of 1920x1080 pixels. It is powered "
				+ "by a Core i5 processor and it comes with 8GB of RAM. The Acer Nitro 5 (Intel) ", 
				"Laptop", "ACER", 75000, 40, true);
		
		
		Product objProduct6 = new Product(6,"Samsung Galaxy S21", "The Galaxy S21 has a 6.2-inch full-HD+ "
				+ "display with a 120Hz refresh rate.. It has Corning Gorilla Glass Victus on the display "
				+ "and a metal frame but the back is made out of plastic.", 
				"Mobile", "SAMSUNG", 38000, 25, false);

		
		Product objProduct7 = new Product(7,"Asus R558UQ", "Asus R558UQ-DM513D is a DOS laptop "
				+ "with a 15.60-inch display that has a resolution of 1920x1080 pixels. It is "
				+ "powered by a Core i5 processor and it comes with 8GB of RAM. The Asus ", 
				"Laptop", "ASUS", 53000, 75, true);

		
		Product objProduct8 = new Product(8,"Asus Rog Phone 3", "The Asus ROG Phone 3 is designed "
				+ "primarily for gaming but tries to be a well-rounded flagship-class phone. It's "
				+ "large and heavy thanks to its 6000mAh battery and cooling apparatus, but is also ", 
				"Mobile", "ASUS", 47000, 15, false);

		
		Product objProduct9 = new Product(9,"Mi 11X 5G", "The phone is easy to hold and is crafted with a "
				+ "slim body for perfect grip giving a stylish look. It has an Octa-Core Qualcomm "
				+ "Snapdragon 870 Processor with Qualcomm Adreno 650 GPU, Qualcomm Kryo 585 CPU, which ", 
				"Mobile", "XIAOMI", 28000, 25, false);

		
		Product objProduct10 = new Product(10,"Apple Iphone 11", "The iPhone 11 is made of aluminium "
				+ "— not stainless steel that's found in the Pro iPhones — and is relatively thicker "
				+ "than the expensive iPhones", 
				"Mobile", "APPLE", 50000, 50, true);
		
		Product objProduct11 = new Product(11,"RealMe 8i", "Realme 8i mobile was launched on 9th "
				+ "September 2021. The phone comes with a 6.60-inch touchscreen display with a resolution "
				+ "of 1080x2412 pixels.", 
				"Mobile", "RealMe", 17000, 50, true);
		
		
		
		this.productService.addProduct(objProduct1);
		this.productService.addProduct(objProduct2);
		this.productService.addProduct(objProduct3);
		this.productService.addProduct(objProduct4);
		this.productService.addProduct(objProduct5);
		this.productService.addProduct(objProduct6);
		this.productService.addProduct(objProduct7);
		this.productService.addProduct(objProduct8);
		this.productService.addProduct(objProduct9);
		this.productService.addProduct(objProduct10);
		this.productService.addProduct(objProduct11);
		
		
		
		
//		Product objProduct1 = new Product();
//		objProduct1.setProductID(1);
//		objProduct1.setProductName("R558UQ");
//		objProduct1.setDescription("It is a laptop");
//		objProduct1.setCategory("Laptop");
//		objProduct1.setBrand("ASUS");
//		objProduct1.setPrice(55000);
//		objProduct1.setDiscount(10);
		
		
		
			
//		
//		Seller objSeller1 = new Seller();
//		objSeller1.setEmail("johncena@wwe.com");
//		objSeller1.setPassword("john@123");
//		objSeller1.setName("John Cena");
//		objSeller1.setPhoneNo("9009009001");
////		objSeller1.setAddress("Chicago USA");
//		
//		Seller objSeller2 = new Seller();
//		objSeller1.setEmail("undertaker@wwe.com");
//		objSeller1.setPassword("under@123");
//		objSeller1.setName("Undertaker");
//		objSeller1.setPhoneNo("8008008001");
////		objSeller1.setAddress("New York USA");
//		
//		Seller objSeller3 = new Seller();
//		objSeller1.setEmail("cmpunk@wwe.com");
//		objSeller1.setPassword("cmpunk@123");
//		objSeller1.setName("CM Punk");
//		objSeller1.setPhoneNo("9879879871");
////		objSeller1.setAddress("Alaska USA");
////		
////		
////		

//		
////		objProduct1.setRecommendation(true);
////		
////		Product objProduct2 = new Product();
////		objProduct1.setProductID(2);
////		objProduct1.setProductName("NITRO");
////		objProduct1.setDescription("It is a SSD laptop");
////		objProduct1.setCategory("Laptop");
////		objProduct1.setBrand("ACER");
////		objProduct1.setPrice(85000);
////		objProduct1.setDiscount(20);
////		objProduct1.setRecommendation(true);
////		
////		
//		List<Product> productsList = new ArrayList<>();
//		productsList.add(objProduct1);
////		productsList.add(objProduct2);
////		
////		
//		List<Seller> sellersList = new ArrayList<>();
//		sellersList.add(objSeller1);
//		sellersList.add(objSeller2);
//		sellersList.add(objSeller3);
//		
//		objProduct1.setSellers(sellersList);
//		
//		this.productService.addProduct(objProduct1);
////				
////		objProduct1.setSellers(sellersList);
////		objProduct2.setSellers(sellersList);
////		
////		objSeller1.setProducts(productsList);
////		objSeller2.setProducts(productsList);
////		objSeller3.setProducts(productsList);
////		
////		this.productService.addProduct(objProduct1);
////		this.productService.addProduct(objProduct2);
//		
////		this.sellerService.addSeller(objSeller1);
////		this.sellerService.addSeller(objSeller2);
////		this.sellerService.addSeller(objSeller3);
//		
	}

}
