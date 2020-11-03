package com.cassiecolvin.hotel;

public class Hotel {
    private String name;
    private String address;
    private int totalMaxCapacity;
    private double taxRate;

    public Hotel(){ }

    public Hotel(String name, String address, int totalMaxCapacity, double taxRate){
        this.name = name;
        this.address = address;
        this.totalMaxCapacity = totalMaxCapacity;
        this.taxRate = taxRate;
    }
}
