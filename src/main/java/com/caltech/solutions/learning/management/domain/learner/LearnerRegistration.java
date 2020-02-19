package com.caltech.solutions.learning.management.domain.learner;

import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import com.caltech.solutions.learning.management.domain.subject.Subject;

import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class LearnerRegistration {

    private Learner learner;

    private List<Subject> subjects;

    private LearningPeriod learningPeriod;

    private String customerId;

    private String year;

    public LearnerRegistration() {}

    public Learner getLearner() {
        return learner;
    }

    public LearnerRegistration setLearner(final Learner learner) {
        this.learner = learner;
        return this;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public LearnerRegistration setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public LearnerRegistration setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public LearnerRegistration setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getYear() {
        return year;
    }

    public LearnerRegistration setYear(final String year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "LearnerRegistration{" +
                "learner=" + learner +
                ", learningPeriod=" + learningPeriod +
                ", customerId='" + customerId + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
