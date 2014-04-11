package com.ams.commons.core.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.ams.commons.core.ref.PropertyType;

/**
 * @author Mark
 */
@Entity(name = "PROPERTY")
public class Property extends ManagedAsset {

    @Embedded
    protected Address address;

    @Enumerated(EnumType.STRING)
    protected PropertyType type;

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
