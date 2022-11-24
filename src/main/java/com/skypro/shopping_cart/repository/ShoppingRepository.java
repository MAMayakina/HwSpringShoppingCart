package com.skypro.shopping_cart.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ShoppingRepository {
    private final List<Integer> listOfId=new ArrayList<>();

    public void addtoCart(List<Integer>ids){
        listOfId.addAll(ids);
    }

    public List<Integer> getCart(){
       return listOfId;
    }
}
