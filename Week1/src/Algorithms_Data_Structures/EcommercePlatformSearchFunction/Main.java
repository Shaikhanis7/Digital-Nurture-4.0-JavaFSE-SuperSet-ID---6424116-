package Algorithms_Data_Structures.EcommercePlatformSearchFunction;

import Algorithms_Data_Structures.EcommercePlatformSearchFunction.model.Product;
import Algorithms_Data_Structures.EcommercePlatformSearchFunction.service.ProductSearch;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Chair", "Furniture"),
                new Product(103, "Notebook", "Stationery"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Table", "Furniture")
        };

        System.out.println("Linear Search:  O(N)");
        Product result1 = ProductSearch.linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found");

        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        System.out.println("\nBinary Search: O(logN)");
        Product result2 = ProductSearch.binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

