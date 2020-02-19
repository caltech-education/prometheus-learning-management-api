package com.caltech.solutions.learning.management.dto.learnerTO;

import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.dto.accessTO.UserAccessTO;
import com.caltech.solutions.learning.management.dto.institutionTO.GradeTO;

import java.util.List;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class LearnerTO implements IInstitutionUser {

    private String userId;

    private List<GradeTO> grade;

    private UserAccessTO userAccessTO;

    private boolean activeStudent;

    public LearnerTO() {}

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public LearnerTO setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public List<GradeTO> getGrade() {
        return grade;
    }

    public LearnerTO setGrade(final List<GradeTO> grade) {
        this.grade = grade;
        return this;
    }

    public UserAccessTO getUserAccessTO() {
        return userAccessTO;
    }

    public LearnerTO setUserAccessTO(final UserAccessTO userAccessTO) {
        this.userAccessTO = userAccessTO;
        return this;
    }

    public boolean isActiveStudent() {
        return activeStudent;
    }

    public LearnerTO setActiveStudent(final boolean activeStudent) {
        this.activeStudent = activeStudent;
        return this;
    }

    @Override
    public String toString() {
        return "LearnerTO{" +
                "userId='" + userId + '\'' +
                ", userAccessTO=" + userAccessTO +
                ", activeStudent=" + activeStudent +
                '}';
    }
}
