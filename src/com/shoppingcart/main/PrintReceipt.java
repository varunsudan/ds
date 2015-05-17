package com.shoppingcart.main;

import com.shoppingcart.cart.ShoppingBasket;
import com.shoppingcart.cart.ShoppingBasketItem;
import com.shoppingcart.goods.Book;
import com.shoppingcart.goods.Food;
import com.shoppingcart.goods.Goods;
import com.shoppingcart.goods.MedicalProduct;
import com.shoppingcart.goods.OtherGoods;

public class PrintReceipt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getFirstBasket().getReceipt();
		System.out.println();
		getSecondBasket().getReceipt();
		System.out.println();
		getThirdBasket().getReceipt();
	}
	
	private static ShoppingBasket getFirstBasket() {
		ShoppingBasket basket = new ShoppingBasket();
		
		Goods goods1 = new Book("book", false, 12.49f);
		ShoppingBasketItem item1 = new ShoppingBasketItem(goods1, 1);
		basket.addItem(item1);
		
		Goods goods2 = new OtherGoods("music CD", false, 14.99f);
		ShoppingBasketItem item2 = new ShoppingBasketItem(goods2, 1);
		basket.addItem(item2);
		
		Goods goods3 = new Food("chocolate bar", false, 0.85f);
		ShoppingBasketItem item3 = new ShoppingBasketItem(goods3, 1);
		basket.addItem(item3);

		return basket;
	}
	
	private static ShoppingBasket getSecondBasket() {
		ShoppingBasket basket = new ShoppingBasket();
		
		Goods goods1 = new Food("imported box of chocolate", true, 10.00f);
		ShoppingBasketItem item1 = new ShoppingBasketItem(goods1, 1);
		basket.addItem(item1);
		
		Goods goods2 = new OtherGoods("imported bottle of perfume", true, 47.50f);
		ShoppingBasketItem item2 = new ShoppingBasketItem(goods2, 1);
		basket.addItem(item2);

		return basket;
	}

	private static ShoppingBasket getThirdBasket() {
		ShoppingBasket basket = new ShoppingBasket();
		
		Goods goods1 = new OtherGoods("imported bottle of perfume", true, 27.99f);
		ShoppingBasketItem item1 = new ShoppingBasketItem(goods1, 1);
		basket.addItem(item1);
		
		Goods goods2 = new OtherGoods("bottle of perfume", false, 18.99f);
		ShoppingBasketItem item2 = new ShoppingBasketItem(goods2, 1);
		basket.addItem(item2);
		
		Goods goods3 = new MedicalProduct("headache pills", false, 9.75f);
		ShoppingBasketItem item3 = new ShoppingBasketItem(goods3, 1);
		basket.addItem(item3);
		
		Goods goods4 = new Food("imported box of chocolate", true, 11.25f);
		ShoppingBasketItem item4 = new ShoppingBasketItem(goods4, 1);
		basket.addItem(item4);



		return basket;
	}


	
}
