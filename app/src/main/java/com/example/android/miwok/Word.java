package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String mDefaultTranslation, String mMiwokTranslation, int imageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return  imageResourceId != NO_IMAGE_PROVIDED ;
    }
}
