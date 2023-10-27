package org.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private String description;
    public Product(){

    }
    public Product(Product product){
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.description = product.description;
    }

    public Product(String id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        return "Product[ " + this.id + ", " + this.name + ", " + this.price + ", " + this.description
                +" ]";
    }
}
