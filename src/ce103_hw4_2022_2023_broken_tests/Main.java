package ce103_hw4_2022_2023_broken_tests;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    MedicalStoreManagement store = new MedicalStoreManagement();
	Scanner scanner = new Scanner(System.in);
    // Load inventory
    try {
      store.loadInventory();
      System.out.println("Inventory loaded successfully");
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error loading inventory: " + e.getMessage());
    }
    int choice;
    do {
      // Display menu
      System.out.println("Medical Store Management");
      System.out.println("1. Add product");
      System.out.println("2. Remove product");
      System.out.println("3. Update product quantity");
      System.out.println("4. Search for product");
      System.out.println("5. Print inventory report");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");

      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          // Add product
          System.out.print("Enter product name: ");
          String name = scanner.next();
          System.out.print("Enter product quantity: ");
          int quantity = scanner.nextInt();
          System.out.print("Enter product price: ");
          double price = scanner.nextDouble();
          store.addProduct(new Product(name, quantity, price));
          break;
        case 2:
          // Remove product
          System.out.print("Enter product name: ");
          name = scanner.next();
          store.removeProduct(name);
          break;
        case 3:
          // Update product quantity
          System.out.print("Enter product name: ");
          name = scanner.next();
          System.out.print("Enter new product quantity: ");
          quantity = scanner.nextInt();
          store.updateQuantity(name, quantity);
          break;
        case 4:
          // Search for product
          System.out.print("Enter product name: ");
          name = scanner.next();
          Product product = store.searchProduct(name);
          if (product == null) {
            System.out.println("Product not found");
          } else {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: " + product.getPrice());
          }
          break;
        case 5:
          // Print inventory report
          store.printInventoryReport();
          break;
        case 6:
          // Save inventory
          try {
            store.saveInventory();
            System.out.println("Inventory saved successfully, exiting");
          } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
          }
          // Exit
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (choice != 6);
  }
}
