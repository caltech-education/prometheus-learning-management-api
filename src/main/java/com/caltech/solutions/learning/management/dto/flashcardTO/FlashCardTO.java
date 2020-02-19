package com.caltech.solutions.learning.management.dto.flashcardTO;

import com.caltech.solutions.learning.management.domain.interfaces.IActivity;
import com.caltech.solutions.learning.management.domain.interfaces.IInstitutionUser;
import com.caltech.solutions.learning.management.dto.subjectTO.SubjectTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */

@ApiModel("Flash Card")
public class FlashCardTO implements IActivity {

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Owner", required = true)
    private IInstitutionUser owner;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "User ID", required = true)
    private String userId;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Subject", required = true)
    private SubjectTO subjectTO;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Topic", required = true)
    private TopicTO topicTO;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Quiz", required = true)
    private String question;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Answer", required = true)
    private String answer;

    @ApiModelProperty(value = "Tips", required = true)
    private Set<String> tips;

    @ApiModelProperty(value = "Access", required = true)
    private String access;

    public FlashCardTO() {}

    public IInstitutionUser getOwner() {
        return owner;
    }

    public FlashCardTO setOwner(final IInstitutionUser owner) {
        this.owner = owner;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public FlashCardTO setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public SubjectTO getSubject() {
        return subjectTO;
    }

    public FlashCardTO setSubject(final SubjectTO subjectTO) {
        this.subjectTO = subjectTO;
        return this;
    }

    public TopicTO getTopicTO() {
        return topicTO;
    }

    public FlashCardTO setTopicTO(final TopicTO topicTO) {
        this.topicTO = topicTO;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public FlashCardTO setQuestion(final String question) {
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public FlashCardTO setAnswer(final String answer) {
        this.answer = answer;
        return this;
    }

    public Set<String> getTips() {
        return tips;
    }

    public FlashCardTO setTips(final Set<String> tips) {
        this.tips = tips;
        return this;
    }

    public String getAccess() {
        return access;
    }

    public FlashCardTO setAccess(final String access) {
        this.access = access;
        return this;
    }

    @Override
    public String toString() {
        return "FlashCardTO{" +
                "owner=" + owner +
                ", userId='" + userId + '\'' +
                ", subjectTO=" + subjectTO +
                ", topicTO=" + topicTO +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", access='" + access + '\'' +
                '}';
    }
}
