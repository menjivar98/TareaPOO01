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
public class Product {

    private String ProductName;
    private String Type;
    private int Price;
    private int Quantity;

    //Constructor sin argumentos
    public Product() {
    }

    //Constructor con argumento
    public Product(String pName, String t, int p, int q) {
        this.ProductName = pName;
        this.Type = t;
        this.Price = p;
        this.Quantity = q;
    }

    //SETTERS AND GETTERS
    //Getters(Obtener)
    public String getProductName() {
        return ProductName;
    }

    public String getType() {
        return Type;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    //SETTERS(Establecer)
    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }
}
