/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


/**
 *
 * @author joaov
 */
public class Product {                  //super classe, as outras duas classes estão herdando todos os comportamentos dessa
    protected String name;
    protected Double price;

    public Product() {
    }
    
    public Product(String name, Double price){      
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String priceTag(){
        return "- " + name + " R$" + String.format("%.2f",price);
    }
    
    
}
