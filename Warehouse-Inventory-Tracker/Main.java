// Warehouse Inventory Tracker using OOP

// Product Class
class Product {
    private String productName;
    private int quantity;
    private int threshold;
    // Constructor using 'this' keyword
    public Product(String productName,int quantity,int threshold) {
        this.productName= productName;
        this.quantity= quantity;
        this.threshold= threshold;
    }

    // Method to check stock status
    public void checkStock() {
        if (quantity < threshold) {
            System.out.println("Product: " + productName + "- Low Stock Alert!");
        } else {
            System.out.println("Product: " + productName + "- Stock OK");
        }
    }

    // Getter methods (for good practice)
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getThreshold() {
        return threshold;
    }
}

// InventoryManager Class
class InventoryManager {
    private Product[] products;

    // Constructor
    public InventoryManager(Product[] products){
        this.products = products;
    }

    // Method to check all products
    public void checkLowStock() {
        System.out.println("Checking Inventory...\n");

        for (int i = 0; i < products.length; i++) {
            products[i].checkStock();
        }
    }

    // Optional: Display full inventory
    public void displayInventory() {
        System.out.println("\nInventory Details:\n");

        for (Product p : products) {
            System.out.println("Product: " + p.getProductName() +
                    " | Quantity: " + p.getQuantity() +
                    " | Threshold: " + p.getThreshold());
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Creating product objects
        Product p1 = new Product("Laptop", 10, 5);
        Product p2 = new Product("Mouse", 2, 5);
        Product p3 = new Product("Keyboard", 8, 3);

        // Store products in array
        Product[] productList = {p1, p2, p3};

        // Create InventoryManager object
        InventoryManager manager = new InventoryManager(productList);

        // Display inventory
        manager.displayInventory();

        // Check stock status
        manager.checkLowStock();
    }
}