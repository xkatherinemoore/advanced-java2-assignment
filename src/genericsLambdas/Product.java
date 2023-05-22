package genericsLambdas;

public class Product {
	//define the instance variables for 'name' and 'price'
	private String name;
	private double price;

	//define a public constructor that takes a name and price as input and sets the instance variables accordingly
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		Inventory<Product> myInventory = new Inventory<>();
		//Add as many products as you want to your Inventory Object using the addItem() method you defined 
		myInventory.addItem(new Product("Airpods", 200.00));
		myInventory.addItem(new Product("Crocs", 59.99));
		myInventory.addItem(new Product("Crocs", 59.99));

		//Your task is to calculate the total price of all products in an Inventory object called myInventory. Follow these steps:
		//1. Call the getItems method on your inventory object to retrieve the list of all products.
		//2. Convert this list into a stream by calling the stream method.
		//3. Apply the mapToDouble operation to this stream. The operation should be applied to each Product object 
		//	 	in the stream, converting it into its price. Use the lambda expression product -> product.price to 
		//		perform this conversion. This expression means "for each product, return its price".
		//4. Apply the sum operation to the stream to get the total price of all products.
		//5. Store this total price in a double variable called priceTotal.
		//6. Print out priceTotal to the console to make sure you are properly summing your Products!

//		https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects
		double priceTotal = myInventory.getItems().stream().mapToDouble(product -> product.price).sum();
//      1.   myInventory.getItems(): This line is calling the getItems method on the myInventory object. This returns the list of all the items (products) in our inventory.
//      2.  .stream(): This converts our list of items into a 'stream'. You can think of a stream like a conveyor belt of items that we can perform operations on one at a time.
//      3.  .mapToDouble(product -> product.price): This is where we use a lambda expression. For each product in our stream, this operation is converting (or 'mapping') the Product object to its price, which is a double value. The product -> product.price part is the lambda expression. You can read it like "for each product, give me the product's price".
//      4.  .sum(): This is an operation on the stream that adds up all the prices we got from the previous step. It gives us the total price of all products in our inventory.

		System.out.println(priceTotal);
	}

}