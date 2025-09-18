package com.gmail.zernetcsgo.hw17;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0),
                new Product("Fridge", "Appliances", 900.0),
                new Product("Camera", "Electronics", 700.0),
                new Product("Sofa", "Furniture", 1100.0),
                new Product("Desk", "Furniture", 300.0)
        );

        Map<String, List<Product>> byCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        Map<String, Double> avgPriceByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));

        Optional<Map.Entry<String, Double>> maxAvgCategory = avgPriceByCategory.entrySet().stream()
                .max(Map.Entry.comparingByValue()); // порівняння по середній ціні

        System.out.println("Групування за категоріями:");
        byCategory.forEach((cat, list) -> System.out.println("  " + cat + " -> " + list));

        System.out.println("\nСередня ціна по категоріях:");
        avgPriceByCategory.forEach((cat, avg) -> System.out.printf("  %s: %.2f%n", cat, avg));

        System.out.println();
        if (maxAvgCategory.isPresent()) {
            var e = maxAvgCategory.get();
            System.out.printf("Категорія з найвищою середньою ціною: %s (%.2f)%n", e.getKey(), e.getValue());
        } else {
            System.out.println("Список порожній — категорію визначити неможливо.");
        }
    }
}
