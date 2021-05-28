package com.employee;

public class notebook implements Equipment {
    private String model;
    private double price;
    public notebook(String model,double price){
        this.model=model;
        this.price=price;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription(){
        return this.model+this.price;
    }
}
