package com.ams.commons.core.models;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.baldy.commons.models.BaseBaldyEntity;

/**
 * Not necessarily a person, could be a company, etc. that is capable of owning something.
 * @author Mark
 */
@Entity(name = "PERSON")
public class Person extends BaseBaldyEntity {

    @Embedded
    private Address address;

    @Column
    private String contactNo;

    @Column
    private String email;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getContactNo() {
        return contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
