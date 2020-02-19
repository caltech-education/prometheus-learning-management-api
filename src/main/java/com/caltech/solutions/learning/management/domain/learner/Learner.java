package com.caltech.solutions.learning.management.domain.learner;

import com.caltech.solutions.learning.management.domain.access.UserAccess;
import com.caltech.solutions.learning.management.domain.institution.Grade;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;

import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Learner implements IInstitutionUser {

    private String userId;

    private List<Grade> grade;

    private UserAccess userAccess;

    private boolean activeStudent;

    public Learner() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public Learner setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public List<Grade> getGrade() {
        return grade;
    }

    public Learner setGrade(final List<Grade> grade) {
        this.grade = grade;
        return this;
    }

    public boolean isActiveStudent() {
        return activeStudent;
    }

    public Learner setActiveStudent(final boolean activeStudent) {
        this.activeStudent = activeStudent;
        return this;
    }

    public UserAccess getUserAccess() {
        return userAccess;
    }

    public Learner setUserAccess(final UserAccess userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "userId='" + userId + '\'' +
                ", grade=" + grade +
                ", userAccess=" + userAccess +
                ", activeStudent=" + activeStudent +
                '}';
    }
}
