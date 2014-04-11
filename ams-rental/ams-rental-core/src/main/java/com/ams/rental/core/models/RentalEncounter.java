package com.ams.rental.core.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.ams.commons.core.models.Encounter;

/**
 * @author mbmartinez
 */
@Entity(name = "ENCOUNTER")
public class RentalEncounter extends Encounter<Tenant> {

    @ManyToOne
    private Tenant tenant;

    @Override
    public Tenant getTenant() {
        return tenant;
    }

    @Override
    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

}
