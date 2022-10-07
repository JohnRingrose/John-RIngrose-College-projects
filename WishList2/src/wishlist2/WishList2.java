/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wishlist2;

import java.io.Serializable;

/**
 *WishList2.java
 * *date 10/01/22
 * @author John Ringrose
 */
public class WishList2 implements Serializable{
    
    
    String number;
    String description;
    String price;
    String url;
    String type;
    String make;
    String model;
    String brand;
    String colour;
    String sport;

    public WishList2() {
       number ="";
       description ="";
       price="";
       url="";
       type="";
       make="";
       model="";
       brand="";
       colour="";
       sport="";
       
    }
    
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
     public String getDetails(){
        return "Number: "+number+"\nDescription: "+description+"\nPrice: "+price+"\nURL: "+url+"\nType: "+type+"\nMake: "+make+"\nModel: "+model+"\nBrand: "+brand+"\nColour: "+colour+"\nSport: "+sport;
    }
    
    
}
