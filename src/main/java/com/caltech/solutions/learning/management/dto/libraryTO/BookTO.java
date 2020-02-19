package com.caltech.solutions.learning.management.dto.libraryTO;

import java.util.Set;

/**
 * @author Thomaz Felipe.
 * Created on 17/02/2020
 */
public class BookTO {

    private VolumeInfoTO volumeInfoTO;

    private String printType;

    private ImageLinkTO imageLinkTO;

    private String averageRating;

    private String ratingsCount;

    private String maturityRating;

    private boolean availableInPDF;

    private boolean allowAnonLogging;

    private String contentVersion;

    private String language;

    private boolean publicDomain;

    private Set<IndustryIdentifierTO> industryIdentifierTOS;

    public BookTO() {}

    public VolumeInfoTO getVolumeInfoTO() {
        return volumeInfoTO;
    }

    public BookTO setVolumeInfoTO(final VolumeInfoTO volumeInfoTO) {
        this.volumeInfoTO = volumeInfoTO;
        return this;
    }

    public String getPrintType() {
        return printType;
    }

    public BookTO setPrintType(final String printType) {
        this.printType = printType;
        return this;
    }

    public ImageLinkTO getImageLinkTO() {
        return imageLinkTO;
    }

    public BookTO setImageLinkTO(final ImageLinkTO imageLinkTO) {
        this.imageLinkTO = imageLinkTO;
        return this;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public BookTO setAverageRating(final String averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    public String getRatingsCount() {
        return ratingsCount;
    }

    public BookTO setRatingsCount(final String ratingsCount) {
        this.ratingsCount = ratingsCount;
        return this;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public BookTO setMaturityRating(final String maturityRating) {
        this.maturityRating = maturityRating;
        return this;
    }

    public boolean isAvailableInPDF() {
        return availableInPDF;
    }

    public BookTO setAvailableInPDF(final boolean availableInPDF) {
        this.availableInPDF = availableInPDF;
        return this;
    }

    public boolean isAllowAnonLogging() {
        return allowAnonLogging;
    }

    public BookTO setAllowAnonLogging(final boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
        return this;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public BookTO setContentVersion(final String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public BookTO setLanguage(final String language) {
        this.language = language;
        return this;
    }

    public boolean isPublicDomain() {
        return publicDomain;
    }

    public BookTO setPublicDomain(final boolean publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }

    public Set<IndustryIdentifierTO> getIndustryIdentifierTOS() {
        return industryIdentifierTOS;
    }

    public BookTO setIndustryIdentifierTOS(final Set<IndustryIdentifierTO> industryIdentifierTOS) {
        this.industryIdentifierTOS = industryIdentifierTOS;
        return this;
    }

    @Override
    public String toString() {
        return "BookTO{" +
                "volumeInfoTO=" + volumeInfoTO +
                ", printType='" + printType + '\'' +
                ", imageLinkTO=" + imageLinkTO +
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
