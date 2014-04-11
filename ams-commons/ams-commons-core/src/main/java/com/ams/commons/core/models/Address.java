package com.ams.commons.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "ADDRESS")
public class Address {

    @Column(name = "STREET")
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
