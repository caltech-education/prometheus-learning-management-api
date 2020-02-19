package com.caltech.solutions.learning.management.domain.institution;

import com.caltech.solutions.learning.management.domain.period.LearningPeriod;

import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Grade {
    private String customerId;

    private LearningPeriod learningPeriod;

    private List<SubjectOffer> subjectsOffer;

    private Double scoreNeeded;

    private Double maxScore;

    public Grade() {}

    public String getCustomerId() {
        return customerId;
    }

    public Grade setCustomerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public Grade setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public List<SubjectOffer> getSubjectsOffer() {
        return subjectsOffer;
    }

    public Grade setSubjectsOffer(final List<SubjectOffer> subjectsOffer) {
        this.subjectsOffer = subjectsOffer;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public Grade setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }

    public Double getMaxScore() {
        return maxScore;
    }

    public Grade setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "customerId='" + customerId + '\'' +
                ", learningPeriod=" + learningPeriod +
                ", subjectsOffer=" + subjectsOffer +
                ", scoreNeeded=" + scoreNeeded +
                ", maxScore=" + maxScore +
                '}';
    }
}
