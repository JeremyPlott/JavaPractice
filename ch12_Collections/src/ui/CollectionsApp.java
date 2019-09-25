package ui;

import util.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Product;

public class CollectionsApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		List<Product> Products = new ArrayList<>();
		Map<String, Product> productsMap = new HashMap<>();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// prompt user to enter product
			String code = Console.getString("Enter pdt code: ");
			String desc = Console.getString("Enter pdt desc: ");
			double price = Console.getDouble("Enter pdt price: ");
			Product p = new Product(code, desc, price);
			
			// add that product in to list and map
			Products.add(p);
			productsMap.put(code, p);
			
			choice = Console.getString("Continue adding products? y/n");
		}
		
		System.out.println("List of products: ");
		for (Product p: Products) {
			System.out.println(p);
		}
		
		String c = Console.getString("Enter code to retrieve: ");
		Product p1 = productsMap.get(c);
		System.out.println(p1);
		
		System.out.println("bye");

	}

}
