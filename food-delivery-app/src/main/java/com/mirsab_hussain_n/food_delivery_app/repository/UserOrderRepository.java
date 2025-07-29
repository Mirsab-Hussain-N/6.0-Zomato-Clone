package com.mirsab_hussain_n.food_delivery_app.repository;
import com.mirsab_hussain_n.food_delivery_app.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;


public interface UserOrderRepository extends JpaRepository<UserOrder, Long> {
    List<UserOrder> findByEmail(String email); 
}
