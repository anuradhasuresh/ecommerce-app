package com.anuradha.ecom.controller;

import com.anuradha.ecom.entity.Product;
import com.anuradha.ecom.entity.ShoppingCart;
import com.anuradha.ecom.repository.ShoppingCartRepository;
import com.anuradha.ecom.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@EnableSwagger2
@Controller
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;
    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/{userId}")
    @ResponseBody
    public ShoppingCart getShoppingCart(@PathVariable Long userId) {
        return shoppingCartRepository.findByUserId(userId)
                .orElse(new ShoppingCart(userId)); // Create a new cart if not found
    }

    @PostMapping("/{userId}/add")
    @ResponseBody
    public ShoppingCart addItemToCart(@PathVariable Long userId, @RequestBody Product product) {
        ShoppingCart shoppingCart = shoppingCartRepository.findByUserId(userId)
                .orElse(new ShoppingCart(userId));

        shoppingCart.addItem(product);
        shoppingCartRepository.save(shoppingCart);

        return shoppingCart;
    }
//    @PostMapping("/")

    @DeleteMapping("/{userId}/remove")
    @ResponseBody
    public ShoppingCart removeItemFromCart(@PathVariable Long userId, @RequestBody Product product) {
        ShoppingCart shoppingCart = shoppingCartRepository.findByUserId(userId)
                .orElse(new ShoppingCart(userId));

        shoppingCart.removeItem(product);
        shoppingCartRepository.save(shoppingCart);

        return shoppingCart;
    }

    @DeleteMapping("/{userId}/clear")
    @ResponseBody
    public void clearShoppingCart(@PathVariable Long userId) {
        shoppingCartRepository.deleteByUserId(userId);
    }
}
