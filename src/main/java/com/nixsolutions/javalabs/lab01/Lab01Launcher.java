package com.nixsolutions.javalabs.lab01;

public class Lab01Launcher {

    private static double[][] matrixInitializer(int aSize) {
        double[][] aMatrix = new double[aSize][aSize];
        for (int i = 0; i < aSize; i++) {
            for (int j = 0; j < aSize; j++) {
                aMatrix[i][j] = Math.round(Math.random() * 1000.0)/100.0;
            }
        }
        return aMatrix;
    }

    public static void main(String[] args) {

        int numberOfElements;
        do {
            numberOfElements = (int)(Math.random() * 10);
        } while (numberOfElements <= 2);

        Matrix matrix01 = new Matrix();
        Matrix matrix02 = new Matrix();
        Matrix matrix03 = new Matrix();

        // initialization of matrices
        matrix01.setMatrix(matrixInitializer(numberOfElements));
        matrix02.setMatrix(matrixInitializer(numberOfElements));
        matrix03.setMatrix(matrixInitializer(numberOfElements));

        // print out of matrices' initial state
        matrix01.printOfMatrix();
        matrix02.printOfMatrix();
        matrix03.printOfMatrix();

        // transpose of matrices
        matrix01.transposeOfMatrix();
        matrix02.transposeOfMatrix();
        matrix03.transposeOfMatrix();

        // print out of transposed matrices
        matrix01.printOfMatrix();
        matrix02.printOfMatrix();
        matrix03.printOfMatrix();

        // addition of two matrices
        matrix03.setMatrix(matrix03.additionOfTwoMatrices(
                matrix01.getMatrix(),
                matrix02.getMatrix()));

        // prints out a result of matrices addition operation
        matrix03.printOfMatrix();

        // multiplication of two matrices
        matrix03.setMatrix(matrix03.multiplicationOfTwoMatrices(
                matrix01.getMatrix(),
                matrix02.getMatrix()));

        // prints out a result of matrices addition operation
        matrix03.printOfMatrix();

    }
}
