package com.caltech.solutions.learning.management.enumeration;

public enum PrivilegeType {
    CREATE("CREATE"),
    READ("READ"),
    WRITE("WRITE"),
    LIST("LIST"),
    DELETE("DELETE"),
    DOWNLOAD("DOWNLOAD"),
    UPLOAD("UPLOAD");

    public final String Privilege;

    PrivilegeType(final String privilege) {
        this.Privilege = privilege;
    }
}
