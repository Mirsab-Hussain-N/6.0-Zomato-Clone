package com.mirsab_hussain_n.food_delivery_app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mirsab_hussain_n.food_delivery_app.RestaurantService;
import com.mirsab_hussain_n.food_delivery_app.FoodItemService;
import com.mirsab_hussain_n.food_delivery_app.entity.Restaurant;
import com.mirsab_hussain_n.food_delivery_app.entity.FoodItem;
import com.mirsab_hussain_n.food_delivery_app.dto.FoodItemRequest;
import java.util.*;

@RestController
@RequestMapping("/food-items")
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    @PostMapping
    public void addFoodItem(@RequestBody FoodItemRequest request  ){
        FoodItem item = new FoodItem();
        item.setId(request.getId());
        item.setName(request.getName());
        item.setPrice(request.getPrice());

        foodItemService.addFoodItem(item, request.getRestaurantId());
    }


    @GetMapping("/menu/{restaurantId}")
    public List<FoodItem> getMenuForRestaurant(@PathVariable Long restaurantId) {
        return foodItemService.getMenuForRestaurant(restaurantId);
    }



}
