package com.anuradha.ecom.service;

import com.anuradha.ecom.entity.Product;
import com.anuradha.ecom.entity.ShoppingCart;
import com.anuradha.ecom.repository.ProductRepository;
import com.anuradha.ecom.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public ShoppingCart getShoppingCart(Long userId) {
        return shoppingCartRepository.findByUserId(userId)
                .orElseGet(() -> {
                    ShoppingCart cart = new ShoppingCart();
                    cart.setUserId(userId);
                    return shoppingCartRepository.save(cart);
                });
    }
}