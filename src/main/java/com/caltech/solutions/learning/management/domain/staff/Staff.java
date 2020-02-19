package com.caltech.solutions.learning.management.domain.staff;


import com.caltech.solutions.learning.management.domain.access.UserAccess;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;



import java.util.Date;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Staff implements IInstitutionUser {

    private String userId;

    private UserAccess userAccess;

    private StaffType staffType;

    private String formation;

    private String speciality;

    private Date startDate;

    public Staff() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public Staff setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public UserAccess getUserAccess() {
        return userAccess;
    }

    public Staff setUserAccess(final UserAccess userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public Staff setStaffType(final StaffType staffType) {
        this.staffType = staffType;
        return this;
    }

    public String getFormation() {
        return formation;
    }

    public Staff setFormation(final String formation) {
        this.formation = formation;
        return this;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Staff setSpeciality(final String speciality) {
        this.speciality = speciality;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Staff setStartDate(final Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "userId='" + userId + '\'' +
                ", userAccess=" + userAccess +
                ", staffType=" + staffType +
                ", formation='" + formation + '\'' +
                ", speciality='" + speciality + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
