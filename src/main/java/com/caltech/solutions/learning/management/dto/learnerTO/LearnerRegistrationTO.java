package com.caltech.solutions.learning.management.dto.learnerTO;

import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectTO;

import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class LearnerRegistrationTO {

    private LearnerTO learnerTO;

    private List<SubjectTO> subjects;

    private LearningPeriod learningPeriod;

    private String customerId;

    private String year;

    public LearnerRegistrationTO() {}

    public LearnerTO getLearnerTO() {
        return learnerTO;
    }

    public LearnerRegistrationTO setLearnerTO(final LearnerTO learnerTO) {
        this.learnerTO = learnerTO;
        return this;
    }

    public List<SubjectTO> getSubjects() {
        return subjects;
    }

    public LearnerRegistrationTO setSubjects(final List<SubjectTO> subjects) {
        this.subjects = subjects;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public LearnerRegistrationTO setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public LearnerRegistrationTO setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getYear() {
        return year;
    }

    public LearnerRegistrationTO setYear(final String year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "LearnerRegistrationTO{" +
                "learnerTO=" + learnerTO +
                ", learningPeriod=" + learningPeriod +
                ", customerId='" + customerId + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
