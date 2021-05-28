package com.employee;

public class PC implements Equipment {
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return this.model+this.display;
    }
}
