package com.anuradha.ecom.controller;

import com.anuradha.ecom.Product;
import com.anuradha.ecom.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    @ResponseBody
    public List<Product> listProducts() {
        return productRepository.findAll();
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Ash", 40, "beast"));
//        System.out.println(products.size());
//        return products.toString();
    }
    @PostMapping("/products/post")
    @ResponseBody
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @GetMapping("/byName")
    @ResponseBody
    public List<Product> findByName(@RequestParam String name) {
        return productRepository.findByName(name);
    }
    @GetMapping("/byPriceLessThan")
    @ResponseBody
    public List<Product> findByPriceLessThan(@RequestParam double price) {
        return productRepository.findByPriceLessThan(price);
    }
    @GetMapping("/byCategory")
    @ResponseBody
    public List<Product> findByCategory(@RequestParam String category) {
        return productRepository.findByCategory(category);
    }
    @GetMapping("/byNameContaining")
    @ResponseBody
    public List<Product> findByNameContaining(@RequestParam String keyword) {
        return productRepository.findByNameContaining(keyword);
    }
    @GetMapping("/byOrderAsc")
    @ResponseBody
    public List<Product> findByOrderByPriceAsc() {
        return productRepository.findByOrderByPriceAsc();
    }
    @GetMapping("/byOrderDesc")
    @ResponseBody
    public List<Product> findByOrderByPriceDesc() {
        return productRepository.findByOrderByPriceAsc();
    }
}
