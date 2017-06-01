package com.example.android.miwok;

/**
 * Created by Alexander on
 * 5/17/2017.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = 0;
    //Default Translation for the words
    private final String mDefaultTranslation;
    //Miwok Translation for the words
    private final String mMiwokTranslation;
    //Default image for the words
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    // constructor for the new word object
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return the image source Id for the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return Whether or not there is an image for this word
     */

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
