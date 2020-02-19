package com.caltech.solutions.learning.management.dto.flashcardTO;

import com.caltech.solutions.learning.management.domain.subject.Subject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

@ApiModel("Topic")
public class TopicTO {

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Subject", required = true)
    private Subject subject;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Name", required = true)
    private String name;

    @NotNull
    @NotBlank
    @ApiModelProperty(value = "Description", required = true)
    private String description;

    public TopicTO() {}

    public Subject getSubject() {
        return subject;
    }

    public TopicTO setSubject(final Subject subject) {
        this.subject = subject;
        return this;
    }

    public String getName() {
        return name;
    }

    public TopicTO setName(final String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TopicTO setDescription(final String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "TopicTO{" +
                "subject=" + subject +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
