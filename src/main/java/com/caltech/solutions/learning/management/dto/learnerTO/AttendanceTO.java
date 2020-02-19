package com.caltech.solutions.learning.management.dto.learnerTO;

import java.util.Date;
import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */

public class AttendanceTO {

    private Date date;

    private boolean present;

    private boolean absent;

    private boolean excused;

    private boolean unexcused;

    private String description;

    private List<String> excusedUrlFiles;

    public AttendanceTO() {}

    public Date getDate() {
        return date;
    }

    public AttendanceTO setDate(final Date date) {
        this.date = date;
        return this;
    }

    public boolean isPresent() {
        return present;
    }

    public AttendanceTO setPresent(final boolean present) {
        this.absent = !present;
        this.present = present;
        return this;
    }

    public boolean isAbsent() {
        return absent;
    }

    public AttendanceTO setAbsent(final boolean absent) {
        this.present = !absent;
        this.absent = absent;
        return this;
    }

    public boolean isExcused() {
        return excused;
    }

    public AttendanceTO setExcused(final boolean excused) {
        this.unexcused = !excused;
        this.excused = excused;
        return this;
    }

    public boolean isUnexcused() {
        return unexcused;
    }

    public AttendanceTO setUnexcused(final boolean unexcused) {
        this.excused = !unexcused;
        this.unexcused = unexcused;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AttendanceTO setDescription(final String description) {
        this.description = description;
        return this;
    }

    public List<String> getExcusedUrlFiles() {
        return excusedUrlFiles;
    }

    public AttendanceTO setExcusedUrlFiles(final List<String> excusedUrlFiles) {
        this.excusedUrlFiles = excusedUrlFiles;
        return this;
    }

    @Override
    public String toString() {
        return "AttendanceTO{" +
                "date=" + date +
                ", present=" + present +
                ", absent=" + absent +
                ", excused=" + excused +
                ", unexcused=" + unexcused +
                ", description='" + description + '\'' +
                '}';
    }
}
