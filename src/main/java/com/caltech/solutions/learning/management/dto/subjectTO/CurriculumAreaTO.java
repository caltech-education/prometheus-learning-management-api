package com.caltech.solutions.learning.management.dto.subjectTO;

import com.caltech.solutions.learning.management.enumeration.KnowledgeAreaType;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class CurriculumAreaTO {

    private String componentName;

    private KnowledgeAreaType knowledgeAreaType;

    private String description;

    public CurriculumAreaTO() {}

    public String getComponentName() {
        return componentName;
    }

    public CurriculumAreaTO setComponentName(final String componentName) {
        this.componentName = componentName;
        return this;
    }

    public KnowledgeAreaType getKnowledgeAreaType() {
        return knowledgeAreaType;
    }

    public CurriculumAreaTO setKnowledgeAreaType(final KnowledgeAreaType knowledgeAreaType) {
        this.knowledgeAreaType = knowledgeAreaType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CurriculumAreaTO setDescription(final String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "CurriculumAreaTO{" +
                "componentName='" + componentName + '\'' +
                ", knowledgeAreaType=" + knowledgeAreaType +
                ", description='" + description + '\'' +
                '}';
    }
}
