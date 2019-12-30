package com.example.exampleapp0;


import android.util.Log;

public class Fan extends Device implements Switchable {

    public Fan(){
        setDeviceName("FAN");
    }

    @Override
    public void breakDevice(){
        Log.e(getDeviceName(),"Oops! Fan broke !!");
    }

    public void turnOn(){
        Log.e(getDeviceName(),"FAN IS ON !!");
    }

    public void turnOff(){
        Log.e(getDeviceName(),"OHH, FAN IS OFF !!");
    }

}
