package com.caltech.solutions.learning.management.dto.institutionTO;

import com.caltech.solutions.learning.management.dto.staffTO.StaffTO;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectTO;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */

public class SubjectOfferTO {

    private SubjectTO subject;

    private StaffTO teacher;

    private ScheduleTO scheduleTO;

    private Double scoreNeeded;

    private Double maxScore;

    public SubjectOfferTO() {}

    public SubjectTO getSubject() {
        return subject;
    }

    public SubjectOfferTO setSubject(final SubjectTO subject) {
        this.subject = subject;
        return this;
    }

    public StaffTO getTeacher() {
        return teacher;
    }

    public SubjectOfferTO setTeacher(final StaffTO teacher) {
        this.teacher = teacher;
        return this;
    }

    public ScheduleTO getScheduleTO() {
        return scheduleTO;
    }

    public SubjectOfferTO setScheduleTO(final ScheduleTO scheduleTO) {
        this.scheduleTO = scheduleTO;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public SubjectOfferTO setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }

    public Double getMaxScore() {
        return maxScore;
    }

    public SubjectOfferTO setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    @Override
    public String toString() {
        return "SubjectOfferTO{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", scheduleTO=" + scheduleTO +
                ", scoreNeeded=" + scoreNeeded +
                ", maxScore=" + maxScore +
                '}';
    }
}
