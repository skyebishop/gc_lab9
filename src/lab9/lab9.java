package lab9;

import java.util.*;

public class lab9 {
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {

		String item = "";
		double price = 0;
		String userChoice = "";
		boolean addToCart = true;
		boolean validItem = false;

		// welcome message
		System.out.println("Welcome to the supermarket!\n" + supermarket);

		// use a Map to track String: item name and Double: item price
		// use parallel ArrayLists (one for strings, one for doubles) to store the items

		do {

			do  { // validation loop
				System.out.println("What item would you like to add to your cart?");
				item = scnr.nextLine();

				try {
					addToArray(item);
					//validItem = true;
				} catch (IllegalArgumentException e) {
					validItem = true;
					System.out.println("That is not a valid item. Please select an item from the list.");

				}

				

			} while (validItem);

			System.out.println("Would you like to add anything else to your cart? (yes/no)");
			userChoice = scnr.nextLine();
			
		} while (userChoice.equals("yes"));
		
		System.out.println(itemArray);
		System.out.println(priceArray);
		
		
	}

	static ArrayList<String> itemArray = new ArrayList<String>(12);
	static ArrayList<Double> priceArray = new ArrayList<Double>(12);
	
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

	}

	public static void addToArray(String item) {
		boolean flag = true;

		if (supermarket.containsKey(item)) {
			itemArray.add(item);
			double price = supermarket.get(item);
			priceArray.add(price);
			System.out.println("Adding " + item + " to cart for " + price);
		} else {
			flag = false;
			throw new IllegalArgumentException("item outside of list.");
		}

	}

	// method 1: find average cost of items ordered
	// method 2: find index of highest cost item
	// method 3: find index of lowest cost item

}
