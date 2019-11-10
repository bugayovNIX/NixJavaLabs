package com.nixsolutions.javalabs.lab02;

import java.util.Random;

public class FractionOps implements FractionNumberOperation {

    private int dividend;
    private int divisor;
    private double value;

    public FractionOps() {
        setDivisor(getRandomInt());
        setDividend(getRandomInt());
        setValue(value());
    }

    private int getRandomInt() {
        int randomInt;
        Random randomIntGenerator = new Random();
        randomInt = randomIntGenerator.nextInt(50) + 10;
        return randomInt;
    }

    private void setValue(double value) {
        this.value = value;
    }

//    public double getValue() {
//        return this.value;
//    }

    @Override
    public void setDividend(int var1) {
        this.dividend = getRandomInt();
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int var1) {
        this.divisor = getRandomInt();
    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {
        return (Math.round(Math.random() + 10) * 100) / 100;
    }

    @Override
    public String toStringValue() {
        return String.valueOf(this.value);
    }

    @Override
    public FractionNumber add(FractionNumber var1, FractionNumber var2) {
        this.value = var1.getDividend() + var2.getDivisor();
        return this;
    }

    @Override
    public FractionNumber sub(FractionNumber var1, FractionNumber var2) {
        this.value = var1.getDividend() - var2.getDivisor();
        return this;
    }

    @Override
    public FractionNumber mul(FractionNumber var1, FractionNumber var2) {
        this.value = var1.getDividend() * var2.getDivisor();
        return this;
    }

    @Override
    public FractionNumber div(FractionNumber var1, FractionNumber var2) {
        this.value = var1.getDividend() / var2.getDivisor();
        return this;
    }
}
