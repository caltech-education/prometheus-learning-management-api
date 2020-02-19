package com.caltech.solutions.learning.management.domain.library;

import com.caltech.solutions.learning.management.domain.learner.Learner;
import com.caltech.solutions.learning.management.domain.staff.Staff;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class BookLoan {

    private Staff staff;

    private Learner learner;

    private String identifier;

    public BookLoan() {}

    public Staff getStaff() {
        return staff;
    }

    public BookLoan setStaff(final Staff staff) {
        this.staff = staff;
        return this;
    }

    public Learner getLearner() {
        return learner;
    }

    public BookLoan setLearner(final Learner learner) {
        this.learner = learner;
        return this;
    }

    public String getIdentifier() {
        return identifier;
    }

    public BookLoan setIdentifier(final String identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public String toString() {
        return "BookLoan{" +
                "staff=" + staff +
                ", learner=" + learner +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
