package com.caltech.solutions.learning.management.dto.accessTO;

import com.caltech.solutions.learning.management.enumeration.PrivilegeType;

import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */

public class UserAccessTO {

    private Short level;

    private String shortName;

    private String fullName;

    private String customerId;

    private Set<PrivilegeType> privilegeTypes;

    public UserAccessTO() {}

    public Short getLevel() {
        return level;
    }

    public UserAccessTO setLevel(final Short level) {
        this.level = level;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public UserAccessTO setShortName(final String shortName) {
        this.shortName = shortName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserAccessTO setFullName(final String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public UserAccessTO setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public Set<PrivilegeType> getPrivilegeTypes() {
        return privilegeTypes;
    }

    public UserAccessTO setPrivilegeTypes(final Set<PrivilegeType> privilegeTypes) {
        this.privilegeTypes = privilegeTypes;
        return this;
    }

    @Override
    public String toString() {
        return "UserAccessTO{" +
                "level=" + level +
                ", shortName='" + shortName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
