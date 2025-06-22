import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		Product[] products = {
	            new Product(123, "Charger", "Electronics"),
	            new Product(249, "Television", "Electronics"),
	            new Product(874, "Phone", "Electronics"),
	            new Product(222, "Face Wash", "Skin Care"),
	            new Product(873, "Earpods", "Electronics")
	        };
		
		System.out.println("LinearSearch: ");
		
		Product search = ProductSearch.linearSearch(products, 222);
		System.out.println(search != null ? "Product found: " + search : "Product has not found");
		
		System.out.println("BinarySearch: ");
		Arrays.sort(products, Comparator.comparingInt(Product::getPrdtId));
		search = ProductSearch.binarySearch(products, 123);
		System.out.println(search != null ? "Product found: " + search : "Product has not found");

	}

}
