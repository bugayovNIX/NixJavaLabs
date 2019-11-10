package com.nixsolutions.javalabs.lab01;

public class Circle extends Shape {

    private int diameter;
    private int center;

    @Override
    void moveTo(double[][] setOfNewCoords) {
        System.out.println(""); // add obj name with reflection
    }

    @Override
    void resize(double[][] newSizeCoords) {
        System.out.println(""); // add obj name with reflection
    }

    @Override
    void printOut() {
        moveTo(new double[][]{{1.0, 2.3}});
        resize(new double[][]{{3.0, 4.0}});
    }
}
