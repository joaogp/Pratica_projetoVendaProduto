/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Program {
    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);                                   //comando para padronizar as virgulas e numeros
        Scanner sc = new Scanner(System.in);                            //comando para puxar dados do teclado
        
        List<Product> list = new ArrayList<>();                         //criando uma lista do tipo Product
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");     //criando variavel e instaciando de acordo com o padrão escrito
        
        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();                                          
        for(int i=1 ; i<=n ; i++){                                      //usando comando for para acrescentar dados na lista
            
            System.out.println("Dados do produto #" + i);            
            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preço do produto: R$");
            double price = sc.nextDouble();
            System.out.print("O produto é classificado com comum, usado ou importado?: ");
            String resp  = sc.next();
            if(resp.equalsIgnoreCase("comum")){                                 //comando de estrutura de decisão
                Product prod = new Product(name, price);                        //instanciando a classe e adicionando no construtor da propria
                list.add(prod);                                                 //comando para adicionar item na lista
            }else if(resp.equalsIgnoreCase("usado")){
                System.out.print("Digite a data de fabricação(dd/MM/yyyy): ");
                Date manufactureDate = sdf1.parse(sc.next());                   //criando variavel do tipo Date e pedindo para o usuario escrever de acordo com o padrão imposto no começo  a data de fabricação
                Product prod = new UsedProduct(name, price, manufactureDate);   
                list.add(prod);
            } else if(resp.equalsIgnoreCase("importado")){
                System.out.print("valor da porcentagem da taxa: ");
                double fee = sc.nextDouble();                                   
                Product prod = new ImportedProduct(name, price, fee);
                list.add(prod);
            }else{
                System.out.println("Resposta invalida!! ");
            }            
        }
        System.out.println("");
        System.out.println("Nota fiscal: ");
        for(Product x: list){                       //comando for para percorrer toda a lista criada
            System.out.println(x.priceTag());       //chamando o comando para cada item da lista, esse comando informa na tela os dados de acordo com o tipo de produto que o usuario colocou
        }
        sc.close();
    }
    
}
