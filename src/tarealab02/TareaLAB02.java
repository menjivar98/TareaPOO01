/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealab02;

/**
 *
 * @author ferna
 */
public class TareaLAB02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Product p1 = new Product();
        Bill b1 = new Bill();
        Provider pr1 = new Provider();
        
        
        System.out.println(p1.getProductName()+ " " + p1.getType()+ " "+ p1.getPrice()+" "+ p1.getQuantity());
        System.out.println(b1.getProduct()+ " "+ b1.getCost()+" "+b1.getDate()+ " " + b1.getQuantity()+ " " + b1.getStore());
        System.out.println(pr1.getNumber()+" "+pr1.getProduct());
    }
    
}
