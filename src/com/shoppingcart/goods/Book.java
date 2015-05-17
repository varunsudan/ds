package com.shoppingcart.goods;

public class Book extends Goods {

	public Book(String productName, boolean isImported, float price) {
		this.productName = productName;
		this.isImported = isImported;
		this.salesTax = 0;
		this.price = price;
	}
}
