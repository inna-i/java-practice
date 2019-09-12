package com.globallogic.inheritance;

public class EthernetAdapter extends Device {
    private String mac;
    private int speed;

    public EthernetAdapter(String manufacturer, String serialNumber, float price, String mac, int speed) {
        super(manufacturer, serialNumber, price);
        this.mac = mac;
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", mac = " + mac + ", speed = " + speed;
    }
}
