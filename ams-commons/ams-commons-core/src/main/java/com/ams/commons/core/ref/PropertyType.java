package com.ams.commons.core.ref;

/**
 * @author Mark
 */
public enum PropertyType {

    SINGLE_FAMILY_HOME("Single Family Home"),
    DORMITORY("Dormitory"),
    CONDO("Condo");

    private PropertyType(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }
}
