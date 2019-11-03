package com.smnet.wp;

public class WOLURL {

    public static final String URL_PREFIX_PATTERN = "https://wol.jw.org/%s/wol";
    public static final String URL_SUFFIX_PATTERN = "r%d/lp-%s";

    public static final String HOMEPAGE = "h";
    public static final String MEETINGS = "dt";

    public final Languages language;
    public final String pattern;

    public WOLURL(Languages language) {
        this.language = language;
        this.pattern = prefix().concat("/%s/").concat(suffix());
    }

    private String prefix() {
        return String.format(WOLURL.URL_PREFIX_PATTERN, this.language.getAbbreviation());
    }

    private String suffix() {
        return String.format(WOLURL.URL_SUFFIX_PATTERN, this.language.getNumber(), this.language.getSign());
    }

    private String meeting() {
        return String.format(this.pattern, WOLURL.MEETINGS);
    }

    public String homepage() {
        return String.format(this.pattern, WOLURL.HOMEPAGE);
    }

    public String meeting(Integer year, Integer month, Integer day) {
        return String.format(this.meeting().concat("/%d/%d/%d"), year, month, day);
    }
}
