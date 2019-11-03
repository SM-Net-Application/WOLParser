package com.smnet.wp;

public enum Languages {

    ITALIANO("Italiano", "it", 6, "i"),
    DEUTSCH("Deutsch", "de", 10, "x"),
    ENGLISH("English", "en", 1, "e");

    /**
     * language name
     */
    private String language;

    /**
     * Language abbreviation
     */
    private String abbreviation;

    /**
     * Language number
     */
    private Integer number;

    /**
     * Language sign
     */
    private String sign;

    Languages(String language, String abbreviation, Integer number, String sign) {
        this.language = language;
        this.abbreviation = abbreviation;
        this.number = number;
        this.sign = sign;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
