package com.example.exampleapp0;

public abstract class Device {

    protected String deviceName = "DEVICE";
    protected boolean isOn;

    public abstract void breakDevice();

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
