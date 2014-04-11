package com.ams.commons.core.models;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.baldy.commons.models.BaseBaldyEntity;
import com.baldy.commons.security.models.Account;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ManagedAsset extends BaseBaldyEntity {

    @ManyToOne
    private Person owner;

    @ManyToOne
    private Account manager;

    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Account getManager() {
        return manager;
    }
    public void setManager(Account manager) {
        this.manager = manager;
    }

}
