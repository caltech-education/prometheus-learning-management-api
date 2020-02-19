package com.caltech.solutions.learning.management.dto.institutionTO;

import com.caltech.solutions.learning.management.domain.staff.Staff;
import com.caltech.solutions.learning.management.enumeration.PeriodOfDay;

import java.time.DayOfWeek;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */

public class ScheduleTO {

    private Staff teacher;

    private DayOfWeek dayOfWeek;

    private PeriodOfDay periodOfDay;

    private String startHour;

    private String endHour;

    private ScheduleTO() {}

    public Staff getTeacher() {
        return teacher;
    }

    public ScheduleTO setTeacher(final Staff teacher) {
        this.teacher = teacher;
        return this;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public ScheduleTO setDayOfWeek(final DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public PeriodOfDay getPeriodOfDay() {
        return periodOfDay;
    }

    public ScheduleTO setPeriodOfDay(final PeriodOfDay periodOfDay) {
        this.periodOfDay = periodOfDay;
        return this;
    }

    public String getStartHour() {
        return startHour;
    }

    public ScheduleTO setStartHour(final String startHour) {
        this.startHour = startHour;
        return this;
    }

    public String getEndHour() {
        return endHour;
    }

    public ScheduleTO setEndHour(final String endHour) {
        this.endHour = endHour;
        return this;
    }

    @Override
    public String toString() {
        return "ScheduleTO{" +
                "teacher=" + teacher +
                ", dayOfWeek=" + dayOfWeek +
                ", periodOfDay=" + periodOfDay +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
