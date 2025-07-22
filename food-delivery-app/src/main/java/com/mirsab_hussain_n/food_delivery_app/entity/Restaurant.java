package com.mirsab_hussain_n.food_delivery_app.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import jakarta.persistence.*;
import lombok.*;

@Entity         //tells spring this class maps to database table
@Getter
@Setter
// @NoArgsConstructor
// @AllArgsConstructor

public class Restaurant {



    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    
    @OneToMany(mappedBy = "restaurant")
    private List<FoodItem> foodItem;


    public Restaurant() {}
    public Restaurant(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    

}
