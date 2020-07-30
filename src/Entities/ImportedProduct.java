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
public class ImportedProduct extends Product{                                   //herdando os métodos da classe Product
    private Double fee;         

    public ImportedProduct(String name, Double price, Double fee) {             //construtor padrão
        super(name, price);                                                     //comando super indicando que são dados de um construtor da super classe
        this.fee = fee;
    }

    public Double getFee() {
        return fee;
    }
    public void setFee(Double fee) {
        this.fee = fee;
    }
    
    @Override
    public String priceTag(){                                                   //método pedido no exercicio
        return "- " + name + " R$" + String.format("%.2f", price) + " taxa de alfandega: R$" + fee + "\n"
                + "|_Preço total com taxa: " + (price+(price*fee/100));         //calculando a porcentagem do valor total com a taxa
       
    }
    
    
    
    
    
}
