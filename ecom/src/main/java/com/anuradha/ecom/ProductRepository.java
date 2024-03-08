package com.anuradha.ecom;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Find products by name
    List<Product> findByName(String name);

    // Find products by price less than the specified value
    List<Product> findByPriceLessThan(double price);

    // Find products by category
    List<Product> findByCategory(String category);

    // Find products by name containing a certain keyword
    List<Product> findByNameContaining(String keyword);

    // Find products sorted by price in ascending order
    List<Product> findByOrderByPriceAsc();

    // Find products sorted by price in descending order
    List<Product> findByOrderByPriceDesc();
}
