package com.caltech.solutions.learning.management.domain.staff;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class StaffType {
    private String customerId;
    private String name;

    public StaffType() {}

    public String getCustomerId() {
        return customerId;
    }

    public StaffType setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getName() {
        return name;
    }

    public StaffType setName(final String name) {
        this.name = name.toUpperCase();
        return this;
    }

    @Override
    public String toString() {
        return "StaffType{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
