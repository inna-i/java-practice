package com.globallogic.inheritance;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private String serialNumber;
    private float price;

    public Device(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 &&
                manufacturer.equals(device.manufacturer) &&
                serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }

}
