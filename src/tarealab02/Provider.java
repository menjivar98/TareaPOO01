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
public class Provider {

    int Number;
    String Product;

    public Provider() {

    }

    public Provider(int n, String p) {
        this.Number = n;
        this.Product = p;
    }

    //SETTERS AND GETTERS
    //Getters(Obtener);
    public int getNumber() {
        return Number;
    }

    public String getProduct() {
        return Product;
    }

    //SETTERS(Establecer)
    public void setNumber(int number) {
        this.Number = number;
    }

    public void setProduct(String product) {
        this.Product = product;
    }
}
