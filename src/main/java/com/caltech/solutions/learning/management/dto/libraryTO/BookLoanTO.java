package com.caltech.solutions.learning.management.dto.libraryTO;

import com.caltech.solutions.learning.management.domain.learner.Learner;
import com.caltech.solutions.learning.management.domain.staff.Staff;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class BookLoanTO {

    private Staff staff;

    private Learner learner;

    private String identifier;

    public BookLoanTO() {}

    public Staff getStaff() {
        return staff;
    }

    public BookLoanTO setStaff(final Staff staff) {
        this.staff = staff;
        return this;
    }

    public Learner getLearner() {
        return learner;
    }

    public BookLoanTO setLearner(final Learner learner) {
        this.learner = learner;
        return this;
    }

    public String getIdentifier() {
        return identifier;
    }

    public BookLoanTO setIdentifier(final String identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public String toString() {
        return "BookLoanTO{" +
                "staff=" + staff +
                ", learner=" + learner +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
