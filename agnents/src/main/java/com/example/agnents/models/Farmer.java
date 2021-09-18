package com.example.agnents.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Farmer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String vegitable;
    private Date date;
    private double available_quantity;
    private double min_price;
    private double min_quantity;

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the vegitable
     */
    public String getVegitable() {
        return vegitable;
    }

    /**
     * @param vegitable the vegitable to set
     */
    public void setVegitable(String vegitable) {
        this.vegitable = vegitable;
    }

    /**
     * @return Date return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return double return the available_quantity
     */
    public double getAvailable_quantity() {
        return available_quantity;
    }

    /**
     * @param available_quantity the available_quantity to set
     */
    public void setAvailable_quantity(double available_quantity) {
        this.available_quantity = available_quantity;
    }

    /**
     * @return double return the min_price
     */
    public double getMin_price() {
        return min_price;
    }

    /**
     * @param min_price the min_price to set
     */
    public void setMin_price(double min_price) {
        this.min_price = min_price;
    }

    /**
     * @return double return the min_quantity
     */
    public double getMin_quantity() {
        return min_quantity;
    }

    /**
     * @param min_quantity the min_quantity to set
     */
    public void setMin_quantity(double min_quantity) {
        this.min_quantity = min_quantity;
    }

}
