package com.shoppingcart.cart;

import com.shoppingcart.goods.Goods;

public class ShoppingBasketItem {

	private Goods item;
	private int quantity;

	public ShoppingBasketItem(Goods item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public Goods getItem() {
		return item;
	}

	public void setItem(Goods item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotalPriceExcludingSalesTax() {
		return roundOfftoTwoDecimals(item.getPrice() * this.quantity);
	}
	
	public float getTotalSalesTax() {
		float totalPrice = getTotalPriceExcludingSalesTax();
		float totalTax = item.getImportDuty() + item.getSalesTax();
		float totalSalesTax = (totalPrice * totalTax) / 100;
		return roundOfftoTwoDecimals(totalSalesTax);
	}
	
	public float getTotalPriceIncludingSalesTax() {
		float totalPrice = getTotalPriceExcludingSalesTax();
		float totalSalesTax = getTotalSalesTax();
		return roundOfftoTwoDecimals(totalPrice + totalSalesTax);
	}

	@Override
	public String toString() {
		return "CartItem [item=" + item + ", quantity=" + quantity
				+ ", getTotalPrice()=" + getTotalPriceExcludingSalesTax() + "]";
	}

	private float roundOfftoTwoDecimals(float value) {
		float tempValue = Math.round(value * 100); 
		return (tempValue/100);
	}
}
