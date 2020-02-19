package com.caltech.solutions.learning.management.dto.staffTO;

import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;

import java.util.Date;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class StaffTO implements IInstitutionUser {

    private String userId;

    private UserAccessTO userAccess;

    private StaffTypeTO staffTypeTO;

    private String formation;

    private String speciality;

    private Date startDate;

    public StaffTO() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public StaffTO setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public UserAccessTO getUserAccess() {
        return userAccess;
    }

    public StaffTO setUserAccess(final UserAccessTO userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public StaffTypeTO getStaffTypeTO() {
        return staffTypeTO;
    }

    public StaffTO setStaffTypeTO(final StaffTypeTO staffTypeTO) {
        this.staffTypeTO = staffTypeTO;
        return this;
    }

    public String getFormation() {
        return formation;
    }

    public StaffTO setFormation(final String formation) {
        this.formation = formation;
        return this;
    }

    public String getSpeciality() {
        return speciality;
    }

    public StaffTO setSpeciality(final String speciality) {
        this.speciality = speciality;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public StaffTO setStartDate(final Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public String toString() {
        return "StaffTO{" +
                "userId='" + userId + '\'' +
                ", userAccess=" + userAccess +
                ", staffTypeTO=" + staffTypeTO +
                ", formation='" + formation + '\'' +
                ", speciality='" + speciality + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
