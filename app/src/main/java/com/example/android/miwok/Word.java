package com.example.android.miwok;

/**
 * Created by admin on 24-06-2016.
 */
public class Word {

    //Default Translation for the words
    private int mDefaultTranslation;

    private int mMiwokTranslation;


    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = 0;

    //Music file Id for words
    private int mAudioResourceId;

    // constructor for the new word object
    public Word(int defaultTranslation, int miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    // constructor for the new word object with image Resource id
    public Word(int defaultTranslation, int miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    //get the default Translation
    public int getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get the miwok Translation
    public int getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //get the audio file resource id
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}