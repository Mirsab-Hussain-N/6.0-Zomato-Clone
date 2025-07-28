package com.mirsab_hussain_n.food_delivery_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mirsab_hussain_n.food_delivery_app.RestaurantService;
import com.mirsab_hussain_n.food_delivery_app.entity.OrderItem;
import com.mirsab_hussain_n.food_delivery_app.entity.Restaurant;
import com.mirsab_hussain_n.food_delivery_app.entity.UserOrder;
import com.mirsab_hussain_n.food_delivery_app.repository.OrderItemRepository;
import com.mirsab_hussain_n.food_delivery_app.repository.OrderRepository;
import com.mirsab_hussain_n.food_delivery_app.dto.*;

import java.util.*;



@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    
    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private OrderItemRepository orderItemRepo;

    @PostMapping  
    public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest request){
        UserOrder order  = new UserOrder();
        order.setPrice(request.getPrice());
        order.setDeliveryFee(request.getDeliveryFee());
        order.setTax(request.getTax());
        order.setName(request.getName());

        List<OrderItem> items = new ArrayList<>();
        for(OrderItemDTO dto: request.getItems()){
            OrderItem item = new OrderItem();
            item.setItemName(dto.getName());
            item.setQty(dto.getQty());
            item.setPrice(dto.getPrice());
            item.setOrder(order);
            items.add(item);
        }
        order.setItems(items);
        orderRepo.save(order);

        UserOrder savedOrder = orderRepo.save(order);
        return ResponseEntity.ok(savedOrder.getId());

        
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserOrder> getOrderById(@PathVariable Long id) {
        Optional<UserOrder> orderOpt = orderRepo.findById(id);
        if (orderOpt.isPresent()) {
            return ResponseEntity.ok(orderOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    
}
