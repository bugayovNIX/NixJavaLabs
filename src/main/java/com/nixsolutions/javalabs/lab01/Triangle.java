package com.nixsolutions.javalabs.lab01;

import java.util.Arrays;

public class Triangle extends Shape {

    private double[][] triangleCoords;

    public void setTriangleCoords(double[][] coords) {
        this.triangleCoords =
                new double[coords.length][coords[0].length];
        for(int i = 0; i < coords.length; i++) {
            System.arraycopy(
                    coords[i], 0,
                    this.triangleCoords[i], 0,
                    coords[i].length);
        }
    }

    public double[][] getTriangleCoords(double[][] setOfCoords) {
        setOfCoords = new double
                [this.triangleCoords.length][this.triangleCoords[0].length];
        for(int i = 0; i < this.triangleCoords.length; i++) {
            System.arraycopy(
                    this.triangleCoords[i], 0,
                    setOfCoords[i], 0,
                    this.triangleCoords[i].length);
        }
        return setOfCoords;
    }

    @Override
    void moveTo(double[][] setNewCoords) {
        // implement to change a position by only two any coords, (x,y)
    }

    @Override
    void resize(double[][] newSizeCoords) {
        this.triangleCoords =
                new double[newSizeCoords.length][newSizeCoords[0].length];
        for(int i = 0; i < newSizeCoords.length; i++) {
            System.arraycopy(
                    newSizeCoords[i], 0,
                    this.triangleCoords[i], 0,
                    newSizeCoords[i].length);
        }
    }

    @Override
    void printOut() {
        for(double[] anItem : this.triangleCoords) {
            System.out.println(Arrays.toString(anItem));
        }
        System.out.println();
    }

}
