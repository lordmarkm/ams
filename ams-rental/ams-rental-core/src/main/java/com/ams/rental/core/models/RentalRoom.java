package com.ams.rental.core.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.ams.commons.core.models.Location;
import com.ams.commons.core.models.Property;

@Entity(name = "ROOM")
public class RentalRoom extends Location<Property> {

    @ManyToOne
    private Property asset;

    @Override
    public Property getAsset() {
        return asset;
    }

    @Override
    public void setAsset(Property asset) {
        this.asset = asset;
    }

}
