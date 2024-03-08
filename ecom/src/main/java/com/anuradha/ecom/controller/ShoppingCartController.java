package com.anuradha.ecom.controller;

import com.anuradha.ecom.Product;
import com.anuradha.ecom.ShoppingCart;
import com.anuradha.ecom.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @GetMapping("/{userId}")
    public ShoppingCart getShoppingCart(@PathVariable Long userId) {
        return shoppingCartRepository.findByUserId(userId)
                .orElse(new ShoppingCart(userId)); // Create a new cart if not found
    }

    @PostMapping("/{userId}/add")
    public ShoppingCart addItemToCart(@PathVariable Long userId, @RequestBody Product product) {
        ShoppingCart shoppingCart = shoppingCartRepository.findByUserId(userId)
                .orElse(new ShoppingCart(userId));

        shoppingCart.addItem(product);
        shoppingCartRepository.save(shoppingCart);

        return shoppingCart;
    }

    @DeleteMapping("/{userId}/remove")
    public ShoppingCart removeItemFromCart(@PathVariable Long userId, @RequestBody Product product) {
        ShoppingCart shoppingCart = shoppingCartRepository.findByUserId(userId)
                .orElse(new ShoppingCart(userId));

        shoppingCart.removeItem(product);
        shoppingCartRepository.save(shoppingCart);

        return shoppingCart;
    }

    @DeleteMapping("/{userId}/clear")
    public void clearShoppingCart(@PathVariable Long userId) {
        shoppingCartRepository.deleteByUserId(userId);
    }
}
