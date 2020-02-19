package com.caltech.solutions.learning.management.dto.institutionTO;

import com.caltech.solutions.learning.management.domain.period.LearningPeriod;

import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */

public class GradeTO {

    private String customerId;

    private Double scoreNeeded;

    private LearningPeriod learningPeriod;

    private List<SubjectOfferTO> subjectsOffer;

    public GradeTO() {}

    public String getCustomerId() {
        return customerId;
    }

    public GradeTO setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public GradeTO setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public List<SubjectOfferTO> getSubjectsOffer() {
        return subjectsOffer;
    }

    public GradeTO setSubjectsOffer(final List<SubjectOfferTO> subjectsOffer) {
        this.subjectsOffer = subjectsOffer;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public GradeTO setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }

    @Override
    public String toString() {
        return "GradeTO{" +
                "customerId='" + customerId + '\'' +
                ", scoreNeeded=" + scoreNeeded +
                ", learningPeriod=" + learningPeriod +
                '}';
    }
}
