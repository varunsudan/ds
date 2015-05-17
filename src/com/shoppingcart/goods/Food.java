package com.shoppingcart.goods;

public class Food extends Goods {

	public Food(String productName, boolean isImported, float price) {
		this.productName = productName;
		this.isImported = isImported;
		this.salesTax = 0;
		this.price = price;
	}
}
