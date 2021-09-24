package com.company;

public class FirstAndSecondNames
{
    private static final String[] FIRSTNAMES = {"Alexander","Valeriy","Lev","Tom","Max"};
    private static final String[] SECONDNAMES = {"Adamson","Winter","Dulton","Cramer","Heig"};

    public static String getFIRSTNAMES(int pos) {
        return FIRSTNAMES[pos];
    }

    public static String getSECONDNAMES(int pos) {
        return SECONDNAMES[pos];
    }
}
