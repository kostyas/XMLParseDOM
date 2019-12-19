package com.ua.kashyrin;

public class Users {
    private String name;
    private String surename;
    private String phone;

    public Users(String name, String surename, String phone) {
        this.name = name;
        this.surename = surename;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}