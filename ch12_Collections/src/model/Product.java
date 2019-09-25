package model;

public class Product implements Comparable {
	private String code;
	private String description;
	private double price;
	
	// R click -> source -> generate...
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}	
	public Product() {
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object arg0) {		
		Product p = (Product)arg0;
		return this.code.compareTo(p.getCode());
	}		
	
}
