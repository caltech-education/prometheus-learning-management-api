package com.caltech.solutions.learning.management.domain.quiz;


import com.caltech.solutions.learning.management.domain.interfaces.IActivity;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.util.AnswerOptions;

import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class QuizAnswer implements IActivity {

    private IInstitutionUser owner;

    private Quiz quiz;

    private Set<AnswerOptions> answerOptions;

    private Integer numberOfRetries;

    public QuizAnswer() {}

    public IInstitutionUser getOwner() {
        return owner;
    }

    public QuizAnswer setOwner(final IInstitutionUser owner) {
        this.owner = owner;
        return this;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public QuizAnswer setQuiz(final Quiz quiz) {
        this.quiz = quiz;
        return this;
    }

    public Set<AnswerOptions> getAnswerOptions() {
        return answerOptions;
    }

    public QuizAnswer setAnswerOptions(final Set<AnswerOptions> answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer getNumberOfRetries() {
        return numberOfRetries;
    }

    public QuizAnswer setNumberOfRetries(final Integer numberOfRetries) {
        this.numberOfRetries = numberOfRetries;
        return this;
    }

    @Override
    public String toString() {
        return "QuizAnswer{" +
                "owner=" + owner +
                ", quiz=" + quiz +
                ", numberOfRetries=" + numberOfRetries +
                '}';
    }
}
