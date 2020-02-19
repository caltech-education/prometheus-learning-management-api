package com.caltech.solutions.learning.management.domain.subject;

import com.caltech.solutions.learning.management.enumeration.KnowledgeAreaType;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class CurriculumArea {
    private String componentName;
    private KnowledgeAreaType knowledgeAreaType;
    private String description;

    public CurriculumArea() {}

    public String getComponentName() {
        return componentName;
    }

    public CurriculumArea setComponentName(final String componentName) {
        this.componentName = componentName;
        return this;
    }

    public KnowledgeAreaType getKnowledgeAreaType() {
        return knowledgeAreaType;
    }

    public CurriculumArea setKnowledgeAreaType(final KnowledgeAreaType knowledgeAreaType) {
        this.knowledgeAreaType = knowledgeAreaType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CurriculumArea setDescription(final String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "CurriculumArea{" +
                "componentName='" + componentName + '\'' +
                ", knowledgeAreaType=" + knowledgeAreaType +
                ", description='" + description + '\'' +
                '}';
    }
}
