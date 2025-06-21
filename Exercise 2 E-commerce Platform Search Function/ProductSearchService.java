import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProductSearchService {
    private ProductRepository repository;

    public ProductSearchService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> searchByName(String nameQuery) {
        return repository.getAllProducts().stream()
                .filter(product -> product.getName().toLowerCase(Locale.ROOT).contains(nameQuery.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    public List<Product> searchByCategory(String categoryQuery) {
        return repository.getAllProducts().stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(categoryQuery))
                .collect(Collectors.toList());
    }
}