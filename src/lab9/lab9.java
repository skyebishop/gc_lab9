package lab9;

import java.util.*;

public class lab9 {
	private static Scanner scnr = new Scanner(System.in);                                                                                                                                 

	public static void main(String[] args) {
		
		String item = "";
		double price = 0;
		
		//use a Map to track String: item name, Double: item price
		//use parallel ArrayLists (one of strings, one of doubles) to store the items ordered and their prices
		
		System.out.println("Welcome to the supermarket\n" + supermarket);
		System.out.println("What item would you like to order?");
		item = scnr.nextLine();
		price = supermarket.get(item);
		System.out.println("Adding " + item + " to cart for " + price);

		addToItemArray(item);
		addToPriceArray(price);
		
		System.out.println(itemArray);
		System.out.println(priceArray);



		
	}
	
	//method 0: display list of 8 items w/ names and prices. ask user to enter an item name
	
	static Map<String, Double> supermarket = new HashMap<>();
	static {
		supermarket.put("black beans", 1.29);
		supermarket.put("quinoa", 3.00);
		supermarket.put("yellow onion", 1.00);
		supermarket.put("avocado", 0.99);
		supermarket.put("tomato paste", 0.79);
		supermarket.put("corn tortillas", 1.99);
		supermarket.put("chili powder", 4.29);
		supermarket.put("cumin", 3.49);
		supermarket.put("paprika", 1.00);
		supermarket.put("garlic powder", 5.69);
		supermarket.put("salsa", 3.29);
		supermarket.put("limes", 3.00);
	
		//System.out.println(supermarket);
	
	}
	
	
	static ArrayList<String> itemArray = new ArrayList<String>(12);
	static ArrayList<Double> priceArray = new ArrayList<Double>(12);

	
	public static void addToItemArray(String item) {
		if  (supermarket.containsKey(item)) {
		} itemArray.add(item);
	}
		
		
	
	public static void addToPriceArray(double price)	{
		if (supermarket.containsValue(price)) {
			priceArray.add(price);
		}
	}
	
	
	
	
	//method 1: find average cost of items ordered
	//method 2: find index of highest cost item
	//method 3: find index of lowest cost item
	
	
	
}
