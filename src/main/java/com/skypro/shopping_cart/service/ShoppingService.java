package com.skypro.shopping_cart.service;

import com.skypro.shopping_cart.repository.ShoppingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {
    private final ShoppingRepository shoppingRepository;

    public ShoppingService(ShoppingRepository shoppingRepository) {
        this.shoppingRepository = shoppingRepository;
    }

    public void addId(List<Integer> ids) {
        this.shoppingRepository.addtoCart(ids);
    }


    public List<Integer> getAllId() {
        return this.shoppingRepository.getCart();
    }
}
