# How to get started:

### Method 1 - Starting from Scratch:

1. Inside of an Eclipse Workspace, create a new Java project and call it whatever you want
2. Press finish and inside of src create 2 new Classes called 'Inventory' and 'Product'
3. Inside Product define a main method
4. Start your assignment

### Method 2 - Clone from Github:

1. Open the Git perspective: In Eclipse, select "Window" -> "Perspective" -> "Open Perspective" -> "Other...". Choose "Git" from the list and click "OK".
2. Clone the repository: Click on the "Clone a Git repository" icon in the Git perspective toolbar.
3. Provide the clone URL: Paste the clone URL of the GitHub project into the "URI" field in the "Clone Git Repository" dialog.
4. Authenticate (if required): Enter your GitHub credentials if prompted.
5. Configure the local destination: Choose a directory for the project's local copy.
6. Select branch or tag (optional): Choose a specific branch or leave it as the default.
7. Import the project: On the "Import Projects" screen, select the repository and click "Next".
8. Choose project import options: Select the project(s) you want to import and customize import options as needed. Click "Finish".
9. Wait for the import process: Eclipse will import the project(s) and display progress in the "Progress" view.
10. Open the imported project(s): The project(s) will be available in the Package Explorer or Project Explorer view in Eclipse.
11. Start your assignment

## The Assignment:

We are going to make an Inventory system that can hold Products for an ecommerce website! To do so, we will need to make use of the skills we learned during the Generics and Lambdas Lectures. The assignment will be split up into 2 parts that work hand-in-hand to get a finished project, so here we go!

### Inventory Class

1. Add a type parameter to the Inventory class to say that it works with a generic type
2. Define a list instance variable that takes a generic type parameter
3. Define a public constructor with no parameters that sets the list instance variable to an empty list (you can choose the type of list you want)
4. Define a function that returns all items in the list instance variable
5. Define a function that takes an item of any type as input and adds it to the list
6. Define a function that takes an item of any type as input, removes it from the list, and then returns the updated list
7. Define a function that returns the number of items currently in the list

### Product Class

1. Define the instance variables for 'name' and 'price'.
2. Define a public constructor that takes a name and price as input and sets the instance variables accordingly.
3. Create a new instance of the `Inventory<Product>` class called `myInventory` using the default constructor.
4. Use the `addItem` method of the `myInventory` object to add as many `Product` objects as desired.
5. Calculate the total price of all products in the `myInventory` object by following these steps. Here is some documentation that you can follow in case you get stuck: [How to sum streams of Objects in Java](https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects):
   - Call the `getItems` method on the `myInventory` object to retrieve the list of all products.
   - Convert this list into a stream by calling the `stream` method.
   - Apply the `mapToDouble` operation to the stream. Use the lambda expression `product -> product.price` to convert each `Product` object in the stream to its price.
   - Apply the `sum` operation to the stream to get the total price of all products.
   - Store this total price in a `double` variable called `priceTotal`.
6. Print out the value of `priceTotal` to the console to verify that the sum of the products' prices is correct.
