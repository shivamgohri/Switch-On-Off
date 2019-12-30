package com.example.exampleapp0;

import android.util.Log;

public class Light extends Device implements Switchable{

    public Light(){
        setDeviceName("LIGHT");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(),"Oops! Your light just broke !");
    }

    public void turnOn(){
        Log.e(getDeviceName(),"LIGHT IS ON !!");
    }

    public void turnOff(){
        Log.e(getDeviceName(),"OHH, LIGHT IS OFF !!");
    }
}
