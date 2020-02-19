package com.caltech.solutions.learning.management.dto.libraryTO;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class AuthorTO {

    private String firstName;

    private String middleName;

    private String lastName;

    private String fullName;

    public AuthorTO() {}

    public String getFirstName() {
        return firstName;
    }

    public AuthorTO setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public AuthorTO setMiddleName(final String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AuthorTO setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public AuthorTO setFullName(final String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Override
    public String toString() {
        return "AuthorTO{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
