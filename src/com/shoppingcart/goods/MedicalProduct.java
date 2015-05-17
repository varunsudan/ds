package com.shoppingcart.goods;

public class MedicalProduct extends Goods {

	public MedicalProduct(String productName, boolean isImported, float price) {
		this.productName = productName;
		this.isImported = isImported;
		this.salesTax = 0;
		this.price = price;
	}
}
