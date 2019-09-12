package com.globallogic.inheritance;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionX) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() + ", resolutionX = " + resolutionX + ", resolutionY = " + resolutionY;
    }

}
