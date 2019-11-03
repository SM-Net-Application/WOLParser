package com.smnet.wp;

public class WOLParser {

    public static void main(String args[]) {

        System.out.println("Test");

        WOLURL wolurlIT = new WOLURL(Languages.ITALIANO);
        WOLURL wolurlDE = new WOLURL(Languages.DEUTSCH);
        WOLURL wolurlEN = new WOLURL(Languages.ENGLISH);

        System.out.println(wolurlIT.homepage());
        System.out.println(wolurlDE.homepage());
        System.out.println(wolurlEN.homepage());

        System.out.println(wolurlIT.meeting(2019,11,3));
        System.out.println(wolurlDE.meeting(2019,11,3));
        System.out.println(wolurlEN.meeting(2019,11,3));
    }
}
