package com.caltech.solutions.learning.management.domain.library;

import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 18/02/2020
 */

public class Book {

    private VolumeInfo volumeInfo;

    private String printType;

    private ImageLink imageLink;

    private String averageRating;

    private String ratingsCount;

    private String maturityRating;

    private boolean availableInPDF;

    private boolean allowAnonLogging;

    private String contentVersion;

    private String language;

    private boolean publicDomain;

    private Set<IndustryIdentifier> industryIdentifiers;

    public Book() {}

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public Book setVolumeInfo(final VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
        return this;
    }

    public String getPrintType() {
        return printType;
    }

    public Book setPrintType(final String printType) {
        this.printType = printType;
        return this;
    }

    public ImageLink getImageLink() {
        return imageLink;
    }

    public Book setImageLink(final ImageLink imageLink) {
        this.imageLink = imageLink;
        return this;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public Book setAverageRating(final String averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    public String getRatingsCount() {
        return ratingsCount;
    }

    public Book setRatingsCount(final String ratingsCount) {
        this.ratingsCount = ratingsCount;
        return this;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public Book setMaturityRating(final String maturityRating) {
        this.maturityRating = maturityRating;
        return this;
    }

    public boolean isAvailableInPDF() {
        return availableInPDF;
    }

    public Book setAvailableInPDF(final boolean availableInPDF) {
        this.availableInPDF = availableInPDF;
        return this;
    }

    public boolean isAllowAnonLogging() {
        return allowAnonLogging;
    }

    public Book setAllowAnonLogging(final boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
        return this;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public Book setContentVersion(final String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Book setLanguage(final String language) {
        this.language = language;
        return this;
    }

    public boolean isPublicDomain() {
        return publicDomain;
    }

    public Book setPublicDomain(final boolean publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }

    public Set<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public Book setIndustryIdentifiers(final Set<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "volumeInfo=" + volumeInfo +
                ", printType='" + printType + '\'' +
                ", imageLink=" + imageLink +
                ", averageRating='" + averageRating + '\'' +
                ", ratingsCount='" + ratingsCount + '\'' +
                ", maturityRating='" + maturityRating + '\'' +
                ", availableInPDF=" + availableInPDF +
                ", allowAnonLogging=" + allowAnonLogging +
                ", contentVersion='" + contentVersion + '\'' +
                ", language='" + language + '\'' +
                ", publicDomain=" + publicDomain +
                '}';
    }
}
