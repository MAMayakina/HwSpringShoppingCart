package com.skypro.shopping_cart.controller;

import com.skypro.shopping_cart.service.ShoppingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingController {
    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids) {
        this.shoppingService.addId(ids);
        return "Приняты идентификаторы " + ids;
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return this.shoppingService.getAllId();
    }
}
