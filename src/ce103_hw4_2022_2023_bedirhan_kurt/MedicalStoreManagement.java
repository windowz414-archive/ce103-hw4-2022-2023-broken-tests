package ce103_hw4_2022_2023_bedirhan_kurt;

import java.io.*;
import java.util.*;

public class MedicalStoreManagement {
  // The inventory is stored as a map of product names to Product objects
  private Map<String, Product> inventory;

  // Constructor initializes the inventory map
  public MedicalStoreManagement() {
    inventory = new HashMap<>();
  }

  // Method to add a new product to the inventory
  public void addProduct(Product product) {
    inventory.put(product.getName(), product);
  }

  // Method to remove a product from the inventory
  public void removeProduct(String productName) {
    inventory.remove(productName);
  }

  // Method to update the quantity of a product in the inventory
  public void updateQuantity(String productName, int newQuantity) {
    Product product = inventory.get(productName);
    product.setQuantity(newQuantity);
  }

  // Method to search for a product in the inventory by name
  public Product searchProduct(String productName) {
    return inventory.get(productName);
  }

  // Method to print a report of all products in the inventory
  public void printInventoryReport() {
    System.out.println("Product Name | Quantity | Price");
    for (Product product : inventory.values()) {
      System.out.println(product.getName() + " | " + product.getQuantity() + " | " + product.getPrice());
    }
  }

  // Method to save the inventory to a binary file
  public void saveInventory() throws IOException {
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("inventory.dat"))) {
      out.writeObject(inventory);
    }
  }

  // Method to load the inventory from a binary file
  public void loadInventory() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("inventory.dat"))) {
      inventory = (Map<String, Product>) in.readObject();
    }
  }
}

// Product class to represent a product in the inventory
class Product implements Serializable {
  private String name;
  private int quantity;
  private double price;

  // Constructor to create a new Product
  public Product(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  // Getter and setter methods for the product's properties
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
