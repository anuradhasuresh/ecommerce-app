package com.anuradha.ecom;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    Optional<ShoppingCart> findByUserId(Long userId);

    void deleteByUserId(Long userId);
}
