package com.caltech.solutions.learning.management.domain.institution;

import com.caltech.solutions.learning.management.domain.staff.Staff;
import com.caltech.solutions.learning.management.enumeration.PeriodOfDay;

import java.time.DayOfWeek;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Schedule {

    private Staff teacher;

    private DayOfWeek dayOfWeek;

    private PeriodOfDay periodOfDay;

    private String startHour;

    private String endHour;

    private Schedule() {}

    public Staff getTeacher() {
        return teacher;
    }

    public Schedule setTeacher(final Staff teacher) {
        this.teacher = teacher;
        return this;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Schedule setDayOfWeek(final DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public PeriodOfDay getPeriodOfDay() {
        return periodOfDay;
    }

    public Schedule setPeriodOfDay(final PeriodOfDay periodOfDay) {
        this.periodOfDay = periodOfDay;
        return this;
    }

    public String getStartHour() {
        return startHour;
    }

    public Schedule setStartHour(final String startHour) {
        this.startHour = startHour;
        return this;
    }

    public String getEndHour() {
        return endHour;
    }

    public Schedule setEndHour(final String endHour) {
        this.endHour = endHour;
        return this;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "teacher=" + teacher +
                ", dayOfWeek=" + dayOfWeek +
                ", periodOfDay=" + periodOfDay +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
