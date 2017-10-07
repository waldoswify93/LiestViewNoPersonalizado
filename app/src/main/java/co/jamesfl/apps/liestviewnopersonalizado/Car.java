package co.jamesfl.apps.liestviewnopersonalizado;

/**
 * Created by android on 07/10/2017.
 */

public class Car {
    private String plate;
    private int brand;
    private int model;
    private int color;
    private int price;
    private int picture;

    public Car(String plate, int brand, int model, int color, int price, int picture) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.picture = picture;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
