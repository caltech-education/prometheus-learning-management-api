package com.caltech.solutions.learning.management.domain.library;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */
public class VolumeInfo {

    @NotBlank
    @NotNull
    private Author author;

    @NotBlank
    @NotNull
    private String publisher;

    @NotBlank
    @NotNull
    @Size(min = 4, max = 4)
    private String publishedDate;

    @NotBlank
    @NotNull
    private String description;

    private IndustryIdentifier industryIdentifiers;

    private String pageCount;

    private String printedPageCount;

    public VolumeInfo() {
    }

    public Author getAuthor() {
        return author;
    }

    public VolumeInfo setAuthor(final Author author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public VolumeInfo setPublisher(final String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public VolumeInfo setPublishedDate(final String publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VolumeInfo setDescription(final String description) {
        this.description = description;
        return this;
    }

    public IndustryIdentifier getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public VolumeInfo setIndustryIdentifiers(final IndustryIdentifier industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
        return this;
    }

    public String getPageCount() {
        return pageCount;
    }

    public VolumeInfo setPageCount(final String pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public String getPrintedPageCount() {
        return printedPageCount;
    }

    public VolumeInfo setPrintedPageCount(final String printedPageCount) {
        this.printedPageCount = printedPageCount;
        return this;
    }

    @Override
    public String toString() {
        return "VolumeInfo{" +
                "author=" + author +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", description='" + description + '\'' +
                ", industryIdentifiers=" + industryIdentifiers +
                ", pageCount='" + pageCount + '\'' +
                ", printedPageCount='" + printedPageCount + '\'' +
                '}';
    }
}
