package week11;

import java.util.Random;


import week11.exception.NegativeMeasurementException;

public class Lot {
    private String lotNum;
    private int length;
    private int width;
    private double unitPrice;

    public Lot(String lotNum, int length, int width, double unitPrice) throws NegativeMeasurementException {
        this.lotNum = lotNum;

        if (length < 0) {
            throw new NegativeMeasurementException(length);
        } else {
            this.length = length;
        }

        if (width < 0) {
            throw new NegativeMeasurementException(width);
        } else {
            this.width = width;
        }
        if (unitPrice < 0) {
            throw new NegativeMeasurementException(unitPrice);
        } else {
            this.unitPrice = unitPrice;
        }

    }

    public Lot(Lot other) {
        Random generateRandom = new Random(12);
        this.lotNum = Long.toString(generateRandom.nextLong());
        this.length = other.getLength();
        this.width = other.getWidth();
        this.unitPrice = other.getUnitPrice();
    }

    public String getLotNum() {
        return lotNum;
    }

    public void setLotNum(String lotNum) {
        this.lotNum = lotNum;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getLotValue() {
        return this.getLength() * this.getLength() * this.getUnitPrice();
    }

    public boolean equals(Lot other) {
        if (this.getLength() == other.getLength() && this.getWidth() == other.getWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String returnString = "";

        returnString = "{Lot: " + this.getLotNum() + " length: " + this.getLength() + " width: " + this.getWidth()
                + " lot value: " + getLotValue() + "}";

        return returnString;
    }

    public int compareTo(Lot other) {
        if (this.getLotValue() < other.getLotValue()) {
            return -1;

        } else if (this.getLotValue() > other.getLotValue()) {
            return 1;

        } else {
            return 0;
        }
    }
}