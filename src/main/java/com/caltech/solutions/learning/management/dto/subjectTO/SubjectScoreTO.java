package com.caltech.solutions.learning.management.dto.subjectTO;

import com.caltech.solutions.learning.management.dto.periodTO.LearningPeriodTO;

import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class SubjectScoreTO {

    private SubjectTO subjectTO;

    private Set<ScoreTO> scoreTOS;

    private LearningPeriodTO learningPeriod;

    private String year;

    private String period;

    private Double scoreNeeded;

    public SubjectScoreTO() {}

    public SubjectTO getSubjectTO() {
        return subjectTO;
    }

    public SubjectScoreTO setSubjectTO(final SubjectTO subjectTO) {
        this.subjectTO = subjectTO;
        return this;
    }

    public Set<ScoreTO> getScoreTOS() {
        return scoreTOS;
    }

    public SubjectScoreTO setScoreTOS(final Set<ScoreTO> scoreTOS) {
        this.scoreTOS = scoreTOS;
        return this;
    }

    public LearningPeriodTO getLearningPeriod() {
        return learningPeriod;
    }

    public SubjectScoreTO setLearningPeriod(final LearningPeriodTO learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public String getYear() {
        return year;
    }

    public SubjectScoreTO setYear(final String year) {
        this.year = year;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public SubjectScoreTO setPeriod(final String period) {
        this.period = period;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public SubjectScoreTO setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }

    @Override
    public String toString() {
        return "SubjectScoreTO{" +
                "subjectTO=" + subjectTO +
                ", learningPeriod=" + learningPeriod +
                ", year='" + year + '\'' +
                ", period='" + period + '\'' +
                ", scoreNeeded=" + scoreNeeded +
                '}';
    }
}
