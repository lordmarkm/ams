package com.ams.commons.core.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.ams.commons.core.ref.PropertyType;
import com.baldy.commons.models.proper.Address;

/**
 * @author Mark
 */
@Entity(name = "PROPERTY")
public class Property extends ManagedAsset {

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private PropertyType type;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public PropertyType getType() {
        return type;
    }
    public void setType(PropertyType type) {
        this.type = type;
    }

}
