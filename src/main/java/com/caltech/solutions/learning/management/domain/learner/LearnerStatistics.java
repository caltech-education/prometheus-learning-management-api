package com.caltech.solutions.learning.management.domain.learner;


import com.caltech.solutions.learning.management.domain.library.Book;
import com.caltech.solutions.learning.management.domain.period.LearningPeriod;
import com.caltech.solutions.learning.management.domain.subject.SubjectScore;



import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class LearnerStatistics {

    private Learner learner;


    private LearningPeriod learningPeriod;


    private Set<SubjectScore> scores;


    private Set<Attendance> attendances;


    private Set<Book> booksRead;

    public LearnerStatistics() {}

    public Learner getLearner() {
        return learner;
    }

    public LearnerStatistics setLearner(final Learner learner) {
        this.learner = learner;
        return this;
    }

    public LearningPeriod getLearningPeriod() {
        return learningPeriod;
    }

    public LearnerStatistics setLearningPeriod(final LearningPeriod learningPeriod) {
        this.learningPeriod = learningPeriod;
        return this;
    }

    public Set<SubjectScore> getScores() {
        return scores;
    }

    public LearnerStatistics setScores(final Set<SubjectScore> scores) {
        this.scores = scores;
        return this;
    }

    public Set<Attendance> getAttendances() {
        return attendances;
    }

    public LearnerStatistics setAttendances(final Set<Attendance> attendances) {
        this.attendances = attendances;
        return this;
    }

    public Set<Book> getBooksRead() {
        return booksRead;
    }

    public LearnerStatistics setBooksRead(final Set<Book> booksRead) {
        this.booksRead = booksRead;
        return this;
    }

    @Override
    public String toString() {
        return "LearnerStatistics{" +
                "learner=" + learner +
                ", learningPeriod=" + learningPeriod +
                ", scores=" + scores +
                ", attendances=" + attendances +
                '}';
    }
}
