package com.anuradha.ecom;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @OneToMany
    private List<Product> items;

    public ShoppingCart(Long userId) {
        this.userId = userId;
        this.items = new ArrayList<>();
    }

    public ShoppingCart() {

    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public Long getUserId() {
        return userId;
    }

    public List<Product> getItems() {
        return items;
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public void clearCart() {
        items.clear();
    }
}
