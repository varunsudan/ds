package com.shoppingcart.goods;

public abstract class Goods {

	// Tax & duty values are in percentage.
	protected float salesTax = 10;
	protected boolean isImported = false;
	protected String productName = null;
	protected float price = 0;
	private float importDuty = 0;

	public Goods() {
	}

	public float getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(float salesTax) {
		this.salesTax = salesTax;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTotalSalesTax() {
		return this.salesTax;
	}
	
	public float getImportDuty() {
		if(isImported) {
			this.importDuty = 5;
		}
		return importDuty;
	}

}
