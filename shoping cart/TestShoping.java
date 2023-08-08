package com.techlabs.ShopingCart;

import java.util.Date;

public class TestShoping {

	public static void main(String[] args) {
		Product product=new Product(12, "Chair", 500, 5);
		Product product1=new Product(122, "T.V", 800, 125);
		
		
		LineItem lineItem1=new LineItem(121, 20, 55, product);
		LineItem lineItem2=new LineItem(22, 56, 60, product1);
		
		
		
		Date date=new Date();
		Orders orders=new Orders(10, date, lineItem1);
		System.out.println(product.CalculateDiscountPrice());
		

	}

}
