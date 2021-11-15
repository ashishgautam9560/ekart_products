package com.infy.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.infy.entity.ProductSellerPrice;
import com.infy.service.ProductSellerService;

@Component
public class ProductSellerPriceRunner implements CommandLineRunner {

	@Autowired
	ProductSellerService productSellerService;
	
	@Override
	public void run(String... args) throws Exception {
	
		ProductSellerPrice objPrice1 = new ProductSellerPrice(1, 1, "mayank@seller.com", 70000);
		ProductSellerPrice objPrice2 = new ProductSellerPrice(2, 1, "apurv@seller.com", 62000);
		ProductSellerPrice objPrice3 = new ProductSellerPrice(3, 1, "tanmay@seller.com", 64000);
		ProductSellerPrice objPrice4 = new ProductSellerPrice(4, 2, "mayank@seller.com", 23000);
		ProductSellerPrice objPrice5 = new ProductSellerPrice(5, 2, "apurv@seller.com", 22000);
		ProductSellerPrice objPrice6 = new ProductSellerPrice(6, 2, "tanmay@seller.com", 20000);
		ProductSellerPrice objPrice7 = new ProductSellerPrice(7, 3, "mayank@seller.com", 16000);
		ProductSellerPrice objPrice8 = new ProductSellerPrice(8, 3, "apurv@seller.com", 15000);
		ProductSellerPrice objPrice9 = new ProductSellerPrice(9, 3, "tanmay@seller.com", 17000);
		ProductSellerPrice objPrice10 = new ProductSellerPrice(10, 4, "mayank@seller.com", 70000);
		ProductSellerPrice objPrice11 = new ProductSellerPrice(11, 4, "apurv@seller.com", 67000);
		ProductSellerPrice objPrice12 = new ProductSellerPrice(12, 4, "tanmay@seller.com", 75000);
		ProductSellerPrice objPrice13 = new ProductSellerPrice(13, 5, "mayank@seller.com", 76000);
		ProductSellerPrice objPrice14 = new ProductSellerPrice(14, 5, "apurv@seller.com", 78000);
		ProductSellerPrice objPrice15 = new ProductSellerPrice(15, 5, "tanmay@seller.com", 74000);
		ProductSellerPrice objPrice16 = new ProductSellerPrice(16, 6, "mayank@seller.com", 38000);
		ProductSellerPrice objPrice17 = new ProductSellerPrice(17, 6, "apurv@seller.com", 40000);
		ProductSellerPrice objPrice18 = new ProductSellerPrice(18, 6, "tanmay@seller.com", 36000);
		ProductSellerPrice objPrice19 = new ProductSellerPrice(19, 7, "mayank@seller.com", 55000);
		ProductSellerPrice objPrice20 = new ProductSellerPrice(20, 7, "apurv@seller.com", 52000);
		ProductSellerPrice objPrice21 = new ProductSellerPrice(21, 7, "tanmay@seller.com", 54000);
		ProductSellerPrice objPrice22 = new ProductSellerPrice(22, 8, "mayank@seller.com", 50000);
		ProductSellerPrice objPrice23 = new ProductSellerPrice(23, 8, "apurv@seller.com", 46000);
		ProductSellerPrice objPrice24 = new ProductSellerPrice(24, 8, "tanmay@seller.com", 49000);
		ProductSellerPrice objPrice25 = new ProductSellerPrice(25, 9, "mayank@seller.com", 27000);
		ProductSellerPrice objPrice26 = new ProductSellerPrice(26, 9, "apurv@seller.com", 29000);
		ProductSellerPrice objPrice27 = new ProductSellerPrice(27, 9, "tanmay@seller.com", 30000);
		ProductSellerPrice objPrice28 = new ProductSellerPrice(28, 10, "mayank@seller.com", 50000);
		ProductSellerPrice objPrice29 = new ProductSellerPrice(29, 10, "apurv@seller.com", 52000);
		ProductSellerPrice objPrice30 = new ProductSellerPrice(30, 10, "tanmay@seller.com", 49500);
		
		this.productSellerService.addRecord(objPrice1);
		this.productSellerService.addRecord(objPrice2);
		this.productSellerService.addRecord(objPrice3);
		this.productSellerService.addRecord(objPrice4);
		this.productSellerService.addRecord(objPrice5);
		this.productSellerService.addRecord(objPrice6);
		this.productSellerService.addRecord(objPrice7);
		this.productSellerService.addRecord(objPrice8);
		this.productSellerService.addRecord(objPrice9);
		this.productSellerService.addRecord(objPrice10);
		
		this.productSellerService.addRecord(objPrice11);
		this.productSellerService.addRecord(objPrice12);
		this.productSellerService.addRecord(objPrice13);
		this.productSellerService.addRecord(objPrice14);
		this.productSellerService.addRecord(objPrice15);
		this.productSellerService.addRecord(objPrice16);
		this.productSellerService.addRecord(objPrice17);
		this.productSellerService.addRecord(objPrice18);
		this.productSellerService.addRecord(objPrice19);
		this.productSellerService.addRecord(objPrice20);
		
		this.productSellerService.addRecord(objPrice21);
		this.productSellerService.addRecord(objPrice22);
		this.productSellerService.addRecord(objPrice23);
		this.productSellerService.addRecord(objPrice24);
		this.productSellerService.addRecord(objPrice25);
		this.productSellerService.addRecord(objPrice26);
		this.productSellerService.addRecord(objPrice27);
		this.productSellerService.addRecord(objPrice28);
		this.productSellerService.addRecord(objPrice29);
		this.productSellerService.addRecord(objPrice30);
		
	}
}









