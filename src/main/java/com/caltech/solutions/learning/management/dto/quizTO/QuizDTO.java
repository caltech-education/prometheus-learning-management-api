package com.caltech.solutions.learning.management.dto.quizTO;

import com.caltech.solutions.learning.management.util.AnswerOptions;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */
@ApiModel(value = "Quiz")
public class QuizDTO {

    private String userId;

    private String subjectId;

    private String description;

    private String learnRecommendation;

    private Set<AnswerOptions> answerOptions;

    private Integer maxRetries;

    private String tip;

    private Date expiration;

    public QuizDTO() {}

    public String getUserId() {
        return userId;
    }

    public QuizDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public QuizDTO setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QuizDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLearnRecommendation() {
        return learnRecommendation;
    }

    public QuizDTO setLearnRecommendation(String learnRecommendation) {
        this.learnRecommendation = learnRecommendation;
        return this;
    }

    public Set<AnswerOptions> getAnswerOptions() {
        return answerOptions;
    }

    public QuizDTO setAnswerOptions(Set<AnswerOptions> answerOptions) {
        this.answerOptions = answerOptions;
        return this;
    }

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public QuizDTO setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    public String getTip() {
        return tip;
    }

    public QuizDTO setTip(String tip) {
        this.tip = tip;
        return this;
    }

    public Date getExpiration() {
        return expiration;
    }

    public QuizDTO setExpiration(Date expiration) {
        this.expiration = expiration;
        return this;
    }

    @Override
    public String toString() {
        return "QuizDTO{" +
                "userId='" + userId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", description='" + description + '\'' +
                ", learnRecommendation='" + learnRecommendation + '\'' +
                ", maxRetries=" + maxRetries +
                ", tip='" + tip + '\'' +
                ", expiration=" + expiration +
                '}';
    }
}
