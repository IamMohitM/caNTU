package com.root.cz3002.cantu;

/**
 * Created by shelinalusandro on 8/10/17.
 */

public class MenuItem {
    private Long id;
    private String name;
    private String stall;
    private double price;

    public MenuItem (Long id, String name, String stall, double price){
        this.id = id;
        this.name = name;
        this.stall = stall;
        this.price = price;
    }
    public MenuItem()
    {}

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getStall(){
        return stall;
    }
    public double getPrice(){
        return price;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStall(String stall){
        this.stall = stall;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
