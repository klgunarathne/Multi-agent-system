package com.example.agnents.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private ERole Name;

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
     * @return ERole return the Name
     */
    public ERole getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(ERole Name) {
        this.Name = Name;
    }

}
