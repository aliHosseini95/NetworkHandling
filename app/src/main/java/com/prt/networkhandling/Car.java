package com.prt.networkhandling;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private String type;

    public Car(int id, String brand, String model, String color, String type) {
        setId(id);
        setBrand(brand);
        setModel(model);
        setColor(color);
        setType(type);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
