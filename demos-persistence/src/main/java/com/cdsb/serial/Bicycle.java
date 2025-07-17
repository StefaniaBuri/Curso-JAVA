package com.cdsb.serial;

public class Bicycle {



    private String brand;
    private String model;
    private int radioWheel;
    private String color;
    private int gears;
    private boolean isCustomizable;

    public Bicycle() {
        
    }

    public Bicycle(String brand, String model, int radioWheel, String color, int gears, boolean isCustomizable) {
        this.brand = brand;
        this.model = model;
        this.radioWheel = radioWheel;
        this.color = color;
        this.gears = gears;
        this.isCustomizable = isCustomizable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: ").append(brand).append("\n");
        sb.append("Model: ").append(brand).append("\n");
        sb.append("RadioWheel: ").append(brand).append("\n");
        sb.append("Color: ").append(brand).append("\n");
        sb.append("Gears: ").append(brand).append("\n");
        sb.append("isCustomizable: ").append(brand).append("\n");
        return sb.toString();
    }

}
