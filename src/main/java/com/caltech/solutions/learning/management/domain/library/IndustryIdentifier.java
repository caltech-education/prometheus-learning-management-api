package com.caltech.solutions.learning.management.domain.library;

import com.caltech.solutions.learning.management.enumeration.TypeIndustryIdentifier;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class IndustryIdentifier {

    private TypeIndustryIdentifier type;

    private String identifier;

    public IndustryIdentifier() {}

    public TypeIndustryIdentifier getType() {
        return type;
    }

    public IndustryIdentifier setType(final TypeIndustryIdentifier type) {
        this.type = type;
        return this;
    }

    public String getIdentifier() {
        return identifier;
    }

    public IndustryIdentifier setIdentifier(final String identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public String toString() {
        return "IndustryIdentifier{" +
                "type=" + type +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
