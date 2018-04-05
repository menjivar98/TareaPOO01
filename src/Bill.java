/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class Bill {
    int Quantity;
    String  Product;
    int Cost;
    int Date;
    String Store;
    
    public Bill(){
    }
    
    public Bill(int q, String p, int c,int d,String s){
        this.Quantity = q;
        this.Product = p;
        this.Cost = c;
        this.Date = d;
        this.Store = s;
    }
    
   //SETTERS AND GETTERS
    //Getters(Obtener)
    
    public int getQuantity(){
        return Quantity;
    }
    
    public String getProduct(){
        return Product;
    }
    
    public int getCost(){
        return Cost;
    }
    
    public int getDate(){
        return Date;
    }
    
    public String getStore(){
        return Store;
    }
    
    //SETTERS(Establecer)
    public void setQuantity(int quantity){
        this.Quantity = quantity;
    }
    
    public void setProduct(String product){
        this.Product = product;
    }
    
    public void setCost (int cost){
        this.Cost = cost;
    }
    
    public void setDate(int date){
        this.Date = date;
    }
    
    public void setStore(String store){
        this.Store = store;
    }
    
}
