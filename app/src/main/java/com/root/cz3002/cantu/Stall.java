package com.root.cz3002.cantu;

/**
 * Created by Christantia on 10/6/2017.
 */

public class Stall {
    private long id;
    private String name;
    private String canteen;
    private String cuisine;
    private String openingHour;

    public Stall (int id, String name, String canteen, String cuisine, String openingHour){
        this.id = id;
        this.name = name;
        this.canteen = canteen;
        this.cuisine = cuisine;
        this.openingHour = openingHour;
    }
    public Stall()
    {}
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCanteen(String canteen) {
        this.canteen = canteen;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCanteen(){
        return canteen;
    }
    public String getCuisine(){
        return cuisine;
    }
    public String getOpeningHour(){
        return openingHour;
    }
}
