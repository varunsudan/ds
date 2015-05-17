package com.shoppingcart.cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

	private List<ShoppingBasketItem> items = new ArrayList<ShoppingBasketItem>();

	public ShoppingBasket() {
	};

	public void addItem(ShoppingBasketItem item) {
		items.add(item);
	}

	public void removeItem(ShoppingBasketItem item) {
		items.remove(item);
	}

	public String getReceipt() {
		String receipt = "";
		float totalSalesTax = 0;
		float totalPriceIncludingSalesTax = 0;

		for (ShoppingBasketItem item : items) {

			printItemDetail(item);
			
			totalSalesTax += item.getTotalSalesTax();
			totalPriceIncludingSalesTax += item.getTotalPriceIncludingSalesTax();
		}
		
		print("Sales Tax", totalSalesTax);
		print("Total", totalPriceIncludingSalesTax);
		return receipt;
	}

    private void print(String text, float amount) {
    		System.out.println(text+ ": "+amount);
    }
	
	private void printItemDetail(ShoppingBasketItem item) {
		System.out.println(item.getQuantity() + " "
				+ item.getItem().getProductName() + ": "
				+ item.getTotalPriceIncludingSalesTax());

	}
}
