package com.example.agnents.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String items;
    private String gethering_point;
    private String destination_point;
    private Date date;
    private double price;
    private double quanity;
    

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
     * @return List<String> return the items
     */
    public String getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(String items) {
        this.items = items;
    }

    /**
     * @return String return the gethering_point
     */
    public String getGethering_point() {
        return gethering_point;
    }

    /**
     * @param gethering_point the gethering_point to set
     */
    public void setGethering_point(String gethering_point) {
        this.gethering_point = gethering_point;
    }

    /**
     * @return String return the destination_point
     */
    public String getDestination_point() {
        return destination_point;
    }

    /**
     * @param destination_point the destination_point to set
     */
    public void setDestination_point(String destination_point) {
        this.destination_point = destination_point;
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
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return double return the quanity
     */
    public double getQuanity() {
        return quanity;
    }

    /**
     * @param quanity the quanity to set
     */
    public void setQuanity(double quanity) {
        this.quanity = quanity;
    }

}
