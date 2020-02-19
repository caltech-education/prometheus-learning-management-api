package com.caltech.solutions.learning.management.dto.libraryTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class VolumeInfoTO {

    @NotBlank
    @NotNull
    private AuthorTO authorTO;

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

    private IndustryIdentifierTO industryIdentifiersTO;

    private String pageCount;

    private String printedPageCount;

    public VolumeInfoTO() {}

    public AuthorTO getAuthorTO() {
        return authorTO;
    }

    public VolumeInfoTO setAuthorTO(final AuthorTO authorTO) {
        this.authorTO = authorTO;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public VolumeInfoTO setPublisher(final String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public VolumeInfoTO setPublishedDate(final String publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VolumeInfoTO setDescription(final String description) {
        this.description = description;
        return this;
    }

    public IndustryIdentifierTO getIndustryIdentifiersTO() {
        return industryIdentifiersTO;
    }

    public VolumeInfoTO setIndustryIdentifiersTO(final IndustryIdentifierTO industryIdentifiersTO) {
        this.industryIdentifiersTO = industryIdentifiersTO;
        return this;
    }

    public String getPageCount() {
        return pageCount;
    }

    public VolumeInfoTO setPageCount(final String pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public String getPrintedPageCount() {
        return printedPageCount;
    }

    public VolumeInfoTO setPrintedPageCount(final String printedPageCount) {
        this.printedPageCount = printedPageCount;
        return this;
    }

    @Override
    public String toString() {
        return "VolumeInfoTO{" +
                "authorTO=" + authorTO +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", description='" + description + '\'' +
                ", industryIdentifiersTO=" + industryIdentifiersTO +
                ", pageCount='" + pageCount + '\'' +
                ", printedPageCount='" + printedPageCount + '\'' +
                '}';
    }
}
