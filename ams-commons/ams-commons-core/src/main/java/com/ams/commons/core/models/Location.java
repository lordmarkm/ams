package com.ams.commons.core.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.baldy.commons.models.BaseBaldyEntity;

/**
 * Room, lobby, etc.
 * @author mbmartinez
 */
@Entity(name = "LOCATION")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Location extends BaseBaldyEntity {

    @ManyToOne
    private ManagedAsset asset;

    public ManagedAsset getAsset() {
        return asset;
    }

    public void setAsset(ManagedAsset asset) {
        this.asset = asset;
    }

}
