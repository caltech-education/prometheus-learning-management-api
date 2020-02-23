package com.caltech.solutions.learning.management.dto;

import java.io.Serializable;

public class GenericResponse implements Serializable {

    private int code;

    private Object content;

    private String description;

    private String status;

    public int getCode() {
        return code;
    }

    public GenericResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public Object getContent() {
        return content;
    }

    public GenericResponse setContent(Object content) {
        this.content = content;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GenericResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GenericResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "GenericResponse{" +
                "code=" + code +
                ", content=" + content +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
