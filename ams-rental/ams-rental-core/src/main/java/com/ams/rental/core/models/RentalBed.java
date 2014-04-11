package com.ams.rental.core.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.ams.commons.core.models.Slot;

@Entity(name = "BED")
public class RentalBed extends Slot<RentalRoom> {

    @ManyToOne
    private RentalRoom location;

    @Override
    public RentalRoom getLocation() {
        return location;
    }

    @Override
    public void setLocation(RentalRoom location) {
        this.location = location;
    }

}
