package com.ams.commons.core.models;

import javax.persistence.MappedSuperclass;

import com.baldy.commons.models.BaseBaldyEntity;

@MappedSuperclass
public abstract class Slot<E extends Location> extends BaseBaldyEntity {

    public abstract E getLocation();
    public abstract void setLocation(E location);

}
