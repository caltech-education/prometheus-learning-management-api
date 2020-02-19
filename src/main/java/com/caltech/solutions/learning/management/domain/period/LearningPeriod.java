package com.caltech.solutions.learning.management.domain.period;

import java.util.Date;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class LearningPeriod {

    private String name;

    private String year;

    private Date startDate;

    private Date endDate;

    private String description;

    public LearningPeriod() {}

    public String getName() {
        return name;
    }

    public LearningPeriod setName(final String name) {
        this.name = name;
        return this;
    }

    public String getYear() {
        return year;
    }

    public LearningPeriod setYear(final String year) {
        this.year = year;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public LearningPeriod setStartDate(final Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public LearningPeriod setEndDate(final Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public LearningPeriod setDescription(final String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "LearningPeriod{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                '}';
    }
}
