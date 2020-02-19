package com.caltech.solutions.learning.management.domain.subject;




/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Score {
    private String description;
    private Double scorePoint;

    public Score() {}

    public String getDescription() {
        return description;
    }

    public Score setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getScorePoint() {
        return scorePoint;
    }

    public Score setScorePoint(Double scorePoint) {
        this.scorePoint = scorePoint;
        return this;
    }

    @Override
    public String toString() {
        return "Score{" +
                "description='" + description + '\'' +
                ", scorePoint=" + scorePoint +
                '}';
    }
}
