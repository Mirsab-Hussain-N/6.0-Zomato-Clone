package com.mirsab_hussain_n.food_delivery_app;
import com.mirsab_hussain_n.food_delivery_app.entity.*;
import com.mirsab_hussain_n.food_delivery_app.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }
}
