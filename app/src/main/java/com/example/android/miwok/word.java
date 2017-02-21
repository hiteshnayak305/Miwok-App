package com.example.android.miwok;

/**
 * Class container for pair of english-miwok word
 */

public class word {
    /**
     * value for no image available
     */
    private static final int NO_IMAGE = -1;
    /**
     * container for english text
     */
    private String english;
    /**
     * container for miwok text
     */
    private String miwok;
    /**
     * container for image source
     */
    private int imageId;

    /**
     * container for audio source
     */
    private int audioId;

    /**
     * constructor to create object with two strings
     *
     * @param eng first string english
     * @param mi  second string miwok
     */
    public word(String eng, String mi, int aud) {
        english = eng;
        miwok = mi;
        imageId = NO_IMAGE;
        audioId = aud;
    }

    /**
     * constructor to create object with two string and one image
     * @param eng first string english
     * @param mi second string miwok
     * @param img to initiate imageId
     */
    public word(String eng, String mi, int img, int aud) {
        english = eng;
        miwok = mi;
        imageId = img;
        audioId = aud;
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

    /**
     * check availability of image
     *
     * @return returns true if available
     */
    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }

    /**
     * to get image id from object
     *
     * @return image id as integer
     */
    public int getImageId() {
        return imageId;
    }

    /**
     * to get audio id as integer
     *
     * @return audio id as integer
     */
    public int getAudioId() {
        return audioId;
    }
}
