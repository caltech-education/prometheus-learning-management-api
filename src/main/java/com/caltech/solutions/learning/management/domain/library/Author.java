package com.caltech.solutions.learning.management.domain.library;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Author {

    private String firstName;

    private String middleName;

    private String lastName;

    private String fullName;

    public Author() {}

    public String getFirstName() {
        return firstName;
    }

    public Author setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Author setMiddleName(final String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Author setFullName(final String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
