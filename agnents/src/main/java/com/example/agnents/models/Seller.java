package com.example.agnents.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String vegitable;
    private double buying_qty;
    private double selling_qty;
    private double buying_price;
    private double selling_price;

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
     * @return double return the buying_qty
     */
    public double getBuying_qty() {
        return buying_qty;
    }

    /**
     * @param buying_qty the buying_qty to set
     */
    public void setBuying_qty(double buying_qty) {
        this.buying_qty = buying_qty;
    }

    /**
     * @return double return the selling_qty
     */
    public double getSelling_qty() {
        return selling_qty;
    }

    /**
     * @param selling_qty the selling_qty to set
     */
    public void setSelling_qty(double selling_qty) {
        this.selling_qty = selling_qty;
    }

    /**
     * @return double return the buying_price
     */
    public double getBuying_price() {
        return buying_price;
    }

    /**
     * @param buying_price the buying_price to set
     */
    public void setBuying_price(double buying_price) {
        this.buying_price = buying_price;
    }

    /**
     * @return double return the selling_price
     */
    public double getSelling_price() {
        return selling_price;
    }

    /**
     * @param selling_price the selling_price to set
     */
    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

}
