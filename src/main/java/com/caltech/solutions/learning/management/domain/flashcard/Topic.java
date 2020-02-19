package com.caltech.solutions.learning.management.domain.flashcard;

import com.caltech.solutions.learning.management.domain.subject.Subject;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Topic {

    private Subject subject;

    private String name;

    private String description;

    public Topic() {}

    public Subject getSubject() {
        return subject;
    }

    public Topic setSubject(final Subject subject) {
        this.subject = subject;
        return this;
    }

    public String getName() {
        return name;
    }

    public Topic setName(final String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Topic setDescription(final String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "subject=" + subject +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
