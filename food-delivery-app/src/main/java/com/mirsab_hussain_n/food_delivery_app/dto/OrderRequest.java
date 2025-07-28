package com.mirsab_hussain_n.food_delivery_app.dto;
import java.util.*;

public class OrderRequest {
    
    private String name;
    private double price;
    private double deliveryFee;
    private double tax;
    private List<OrderItemDTO> items;

    public OrderRequest(){};
    public OrderRequest(String name, double price , double deliveryFee, double tax){
        this.name = name;
        this.price = price;
        this.deliveryFee = deliveryFee;
        this.tax = tax;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;   
    }
    public void setDeliveryFee(double deliveryFee){
        this.deliveryFee = deliveryFee;
    }
    public double getDeliveryFee(){
        return deliveryFee;
    }
    public void setTax(double tax){
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }
    public List<OrderItemDTO> getItems(){
        return items;
    }
    public void setItems(List <OrderItemDTO> items){
        this.items = items;
    }

}
