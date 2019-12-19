package com.ua.kashyrin;

public class MenuRestaraunt {

    private String name;
    private String price;
    private String description;
    private int calories;

    public MenuRestaraunt(String name, String price, String description, int calories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "MenuRestaraunt{" +
                "name='" + name + '\'' +
                " price=" + price +
                " description='" + description + '\'' +
                " calories=" + calories +
                '}';
    }
}
