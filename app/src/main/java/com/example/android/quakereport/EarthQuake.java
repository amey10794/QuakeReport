package com.example.android.quakereport;

/**
 * Created by Amey on 1/5/2017.
 */

public class EarthQuake {
    private Double mMagnitude;

    private String mLocation;

    private String mDate;

    private long mTimeInMilliseconds;

    private String mUrl;
    public EarthQuake(Double magnitude, String location, Long timeInMilliseconds, String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;

    }
    public Double  getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return  mLocation;

    }
    public String getDate(){
        return mDate;
    }
    public Long getTimeInMilliseconds(){
        return mTimeInMilliseconds;

    }
    public String getUrl(){
        return mUrl;

    }
}
