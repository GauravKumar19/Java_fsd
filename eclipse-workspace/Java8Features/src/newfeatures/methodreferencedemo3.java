package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class methodreferencedemo3 {

	public static void main(String[] args) {

		Order ord1 = new Order(1000,"GOOG.NS",12000.10,Order.Side.BUY);
		Order ord2 = new Order(500,"FSSAI",6900.10,Order.Side.SELL);
		Order ord3 = new Order(750,"FSSAI",6000.10,Order.Side.BUY);

		List<Order> orderbook = new ArrayList<Order>();
		
		orderbook.add(ord1);
		orderbook.add(ord2);
		orderbook.add(ord3);
		
		
		//sort all orders based on quantity using lambda
		
		System.out.println("Before Sorting:"+orderbook);// invoke toString() method
		Collections.sort(orderbook,(a,b)->Order.compareByQuantity(a, b));
		System.out.println("After Sorting:"+orderbook);
		
		//sort all orders based on quantity using method reference by calling STATIC METHOD
		Collections.sort(orderbook,Order::compareByQuantity);
		System.out.println("After Sorting:"+orderbook);

		//sort all orders based on price using method reference by calling INSTANCE METHOD
		Order order = orderbook.get(0);// we require reference of object
		Collections.sort(orderbook,order::compareByPrice);
		System.out.println("Order Book After Sorting of Price:"+orderbook);
		
		//Method reference example for Arbitrary object of a particular type
		String[] symbols = {"GOOGLE","AMAZON","microsoft","apple"};
		Arrays.sort(symbols, String::compareToIgnoreCase);
		
		for(String i : symbols)
		System.out.println(i);
		
		
		
	}

}
