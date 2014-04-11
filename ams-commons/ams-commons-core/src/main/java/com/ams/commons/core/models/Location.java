package com.ams.commons.core.models;

import javax.persistence.MappedSuperclass;

import com.baldy.commons.models.BaseBaldyEntity;

/**
 * Room, lobby, etc.
 * @author mbmartinez
 */
@MappedSuperclass
public abstract class Location<E extends ManagedAsset> extends BaseBaldyEntity {

    public abstract E getAsset();

    public abstract void setAsset(E asset);

}
