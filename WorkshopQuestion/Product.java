import java.util.*;

class Product {
    String name;
    String category;
    double price;
    int stock;

    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("Name: %-10s | Category: %-10s | Price: ₹%.2f | Stock: %d",
                name, category, price, stock);
    }
}

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String msg) {
        super(msg);
    }
}

class InvalidStockException extends Exception {
    public InvalidStockException(String msg) {
        super(msg);
    }
}

public class ECommerceCatalog {
    static final int MAX_STOCK = 1000;
    static List<Product> catalog = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- E-Commerce Catalog Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product by Name");
            System.out.println("3. Search Product by Category");
            System.out.println("4. Update Stock");
            System.out.println("5. Show Products Sorted by Price");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> searchByName();
                case 3 -> searchByCategory();
                case 4 -> updateStock();
                case 5 -> generateReport();
                case 6 -> exit = true;
                default -> System.out.println("Invalid option! Try again.");
            }
        }

        System.out.println("Program ended.");
    }

    static void addProduct() {
        sc.nextLine(); // consume newline
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Category: ");
        String category = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        int stock = sc.nextInt();

        try {
            if (stock < 0 || stock > MAX_STOCK) {
                throw new InvalidStockException("Stock must be between 0 and " + MAX_STOCK);
            }

            catalog.add(new Product(name, category, price, stock));
            System.out.println(" Product added successfully!");

        } catch (InvalidStockException e) {
            System.out.println("No " + e.getMessage());
        }
    }

    static void searchByName() {
        sc.nextLine();
        System.out.print("Enter product name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (Product p : catalog) {
            if (p.name.equalsIgnoreCase(searchName)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println(" No product found with name: " + searchName);
        }
    }

    static void searchByCategory() {
        sc.nextLine();
        System.out.print("Enter category to search: ");
        String searchCategory = sc.nextLine();
        boolean found = false;

        for (Product p : catalog) {
            if (p.category.equalsIgnoreCase(searchCategory)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println(" No products found in category: " + searchCategory);
        }
    }

    static void updateStock() {
        sc.nextLine();
        System.out.print("Enter product name to update stock: ");
        String productName = sc.nextLine();
        Product productToUpdate = null;

        for (Product p : catalog) {
            if (p.name.equalsIgnoreCase(productName)) {
                productToUpdate = p;
                break;
            }
        }

        if (productToUpdate == null) {
            try {
                throw new ProductNotFoundException("Product not found: " + productName);
            } catch (ProductNotFoundException e) {
                System.out.println("No " + e.getMessage());
            }
            return;
        }

        System.out.print("Enter new stock quantity: ");
        int newStock = sc.nextInt();

        try {
            if (newStock < 0 || newStock > MAX_STOCK) {
                throw new InvalidStockException("Stock must be between 0 and " + MAX_STOCK);
            }

            productToUpdate.stock = newStock;
            System.out.println("yes" Stock updated successfully!");

        } catch (InvalidStockException e) {
            System.out.println("no " + e.getMessage());
        }
    }

    static void generateReport() {
        sc.nextLine();
        System.out.print("Sort by price (asc/desc): ");
        String order = sc.nextLine();

        List<Product> sorted = new ArrayList<>(catalog);
        if (order.equalsIgnoreCase("asc")) {
            sorted.sort(Comparator.comparingDouble(p -> p.price));
        } else if (order.equalsIgnoreCase("desc")) {
            sorted.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        } else {
            System.out.println("Invalid sort order! Use 'asc' or 'desc'.");
            return;
        }

        System.out.println("\n--- Product Report Sorted by Price ---");
        for (Product p : sorted) {
            System.out.println(p);
        }
    }
}
