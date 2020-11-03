package com.cassiecolvin.hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelRoom {
    private final int maxCapacity = 4;
    private List<Patron> patrons = new ArrayList<Patron>();
    private double pricePerNight;
    private int floor;
    private List<Service> services = new ArrayList<Service>();

    public HotelRoom() {}

    public List<Patron> getPatrons() {
        return patrons;
    }

    public void setPatrons(List<Patron> patrons) {
        this.patrons = patrons;
    }

    public void addPatrons(Patron patron){
        patrons.add(patron);
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
