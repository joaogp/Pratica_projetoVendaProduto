/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author joaov
 */
public class UsedProduct extends Product{
    private Date manufactureDate;

    public static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //final para evitar que o método seja sobresposto e transformando em membro estatico
    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        return "- " + name + " R$" + String.format("%.2f", price) + " || Fabricação: " + sdf1.format(manufactureDate);
    } 
    
}
