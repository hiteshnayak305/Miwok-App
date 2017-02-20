package com.example.android.miwok;

/**
 * Class container for pair of english-miwok word
 */

public class word {
    /**
     * container for english text
     */
    private String english;

    /**
     * container for miwok text
     */
    private String miwok;

    /**
     * constructor to create object with two strings
     *
     * @param eng first string english
     * @param mi  second string miwok
     */
    public word(String eng, String mi) {
        english = eng;
        miwok = mi;
    }

    /**
     * to get english word from object
     *
     * @return returns string
     */
    public String getEnglish() {
        return english;
    }

    /**
     * to get miwok word from object
     *
     * @return returns string
     */
    public String getMiwok() {
        return miwok;
    }
}
