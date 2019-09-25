package ui;

import java.util.Arrays;

import model.LineItem;
import model.Product;

public class ProductManagerApp {

	public static void main(String[] args) {
		
		// create an instance of product
		// create an instance of line item
		// print contents to console
		
		Product net = new Product(".Net", "Murach's .Net Programming", 59.50);
		LineItem li = new LineItem(net, 8);
		System.out.println(net);
		System.out.println(li);
		
		// create an array of products
		Product java = new Product("Java", "Murach's Java Programming", 59.50);
		Product html = new Product("HTML", "Murach's HTML Programming", 59.50);
		Product mysql = new Product("MySQL", "Murach's MySQL Programming", 59.50);
		
		Product[] products = {net, java, html, mysql};
		
		System.out.println("Unsorted list of products");
		for (Product p: products ) {
			System.out.println(p);
		}
		System.out.println("Sorted list of products");
		Arrays.sort(products);
		for (Product p: products ) {
			System.out.println(p);
		}



	}

}
