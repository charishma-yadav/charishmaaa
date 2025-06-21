import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductSearchService searchService = new ProductSearchService(repository);

        System.out.println("Search by name 'iPhone':");
        List<Product> resultsByName = searchService.searchByName("iPhone");
        resultsByName.forEach(System.out::println);

        System.out.println("\nSearch by category 'Footwear':");
        List<Product> resultsByCategory = searchService.searchByCategory("Footwear");
        resultsByCategory.forEach(System.out::println);
    }
}