package genericsLambdas;
import java.util.List;
import java.util.stream.Stream;

public class Product {
	//Variables
	private String name;
	private double price;

	//Constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		//Make an Inventory object that holds Products
		Inventory<Product> myInventory = new Inventory<Product>();
		
		//Add Product objects to myInventory
		myInventory.addItem(new Product("milk", 4.00));
		myInventory.addItem(new Product("eggs", 1.50));
		myInventory.addItem(new Product("coffee", 6.75));
		myInventory.addItem(new Product("orange juice", 2.85));
		
		//Calculate total price of all myInventory items
		double priceTotal = myInventory.getItems().stream().mapToDouble(product -> product.price).sum();
		System.out.printf("\nTotal price is: $%.2f\n", priceTotal);

	}

}