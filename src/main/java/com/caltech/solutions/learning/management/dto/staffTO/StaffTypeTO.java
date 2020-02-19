package com.caltech.solutions.learning.management.dto.staffTO;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class StaffTypeTO {

    private String customerId;

    private String name;

    public StaffTypeTO() {}

    public String getCustomerId() {
        return customerId;
    }

    public StaffTypeTO setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getName() {
        return name;
    }

    public StaffTypeTO setName(final String name) {
        this.name = name.toUpperCase();
        return this;
    }

    @Override
    public String toString() {
        return "StaffTypeTO{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
