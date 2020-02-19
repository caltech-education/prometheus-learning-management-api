package com.caltech.solutions.learning.management.dto.subjectTO;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class ScoreTO {

    private String description;

    private Double scorePoint;

    public ScoreTO() {}

    public String getDescription() {
        return description;
    }

    public ScoreTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getScorePoint() {
        return scorePoint;
    }

    public ScoreTO setScorePoint(Double scorePoint) {
        this.scorePoint = scorePoint;
        return this;
    }

    @Override
    public String toString() {
        return "ScoreTO{" +
                "description='" + description + '\'' +
                ", scorePoint=" + scorePoint +
                '}';
    }
}
