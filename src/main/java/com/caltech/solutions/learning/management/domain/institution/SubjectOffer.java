package com.caltech.solutions.learning.management.domain.institution;

import com.caltech.solutions.learning.management.domain.staff.Staff;
import com.caltech.solutions.learning.management.domain.subject.Subject;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class SubjectOffer {

    private Subject subject;

    private Staff teacher;

    private Schedule schedule;

    private Double scoreNeeded;

    public SubjectOffer() {}

    public Subject getSubject() {
        return subject;
    }

    public SubjectOffer setSubject(final Subject subject) {
        this.subject = subject;
        return this;
    }

    public Staff getTeacher() {
        return teacher;
    }

    public SubjectOffer setTeacher(final Staff teacher) {
        this.teacher = teacher;
        return this;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public SubjectOffer setSchedule(final Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public Double getScoreNeeded() {
        return scoreNeeded;
    }

    public SubjectOffer setScoreNeeded(final Double scoreNeeded) {
        this.scoreNeeded = scoreNeeded;
        return this;
    }

    @Override
    public String toString() {
        return "SubjectOffer{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", schedule=" + schedule +
                ", scoreNeeded=" + scoreNeeded +
                '}';
    }
}
