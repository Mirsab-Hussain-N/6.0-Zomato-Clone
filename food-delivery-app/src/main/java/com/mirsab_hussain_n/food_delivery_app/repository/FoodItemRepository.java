package com.mirsab_hussain_n.food_delivery_app.repository;
import com.mirsab_hussain_n.food_delivery_app.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long>{

    List<FoodItem> findByRestaurantId(Long restaurantId);
    List<FoodItem> findByRestaurant(Restaurant restaurant);

}
