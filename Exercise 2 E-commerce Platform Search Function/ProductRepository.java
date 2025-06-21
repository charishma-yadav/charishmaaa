import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        // Sample products
        products.add(new Product(1, "Apple iPhone 15", "Electronics", 1099.99));
        products.add(new Product(2, "Samsung Galaxy S24", "Electronics", 999.99));
        products.add(new Product(3, "Nike Air Max", "Footwear", 149.99));
        products.add(new Product(4, "Levi's 501 Jeans", "Clothing", 89.99));
        products.add(new Product(5, "Sony WH-1000XM5", "Electronics", 349.99));
        products.add(new Product(6, "Adidas Ultraboost", "Footwear", 199.99));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}