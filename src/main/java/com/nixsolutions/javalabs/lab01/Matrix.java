package com.nixsolutions.javalabs.lab01;

import java.util.Arrays;

public class Matrix {

    private double[][] matrixContainer;

    public Matrix() {

    }

    public void setMatrix(double[][] aMatrix) {
        this.matrixContainer = new double[aMatrix.length][aMatrix[0].length];
        for (int i = 0; i < aMatrix.length; i++) {
            System.arraycopy(
                    aMatrix[i], 0,
                    this.matrixContainer[i], 0,
                    aMatrix[i].length);
        }
    }

    public double[][] getMatrix() {
        double[][] aMatrix = new double
                [this.matrixContainer.length]
                [this.matrixContainer[0].length];

        for (int i = 0; i < this.matrixContainer.length; i++) {
            System.arraycopy
                    (this.matrixContainer[i], 0,
                            aMatrix[i], 0,
                            this.matrixContainer[i].length);
        }
        return aMatrix;
    }

    public double[][] additionOfTwoMatrices(
            double[][] firstMatrix,
            double[][] secondMatrix)
    {
        int l1 = firstMatrix.length;
        double[][] additionResult = new double[l1][l1];

        for (int row = 0; row < l1; row++) {
            for (int col = 0; col < l1; col++) {
                additionResult[row][col]
                        = Math.round((firstMatrix[row][col]
                        + secondMatrix[row][col]) * 100.0) / 100.0;
            }
        }
        return additionResult;
    }

    public double[][] multiplicationOfTwoMatrices(
            double[][] firstMatrix,
            double[][] secondMatrix)
    {
        double[][] multiplicationResult = new double
                [firstMatrix.length]
                [secondMatrix[0].length];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[0].length; col++) {
                for (int n = 0; n < firstMatrix[0].length; n++) {
                    multiplicationResult[row][col]
                            += firstMatrix[row][n] * secondMatrix[n][col];
                    multiplicationResult[row][col]
                            = Math.round(multiplicationResult[row][col]
                            * 100.0) / 100.0;
                }
            }
        }
        return multiplicationResult;
    }

    public void transposeOfMatrix() {

        double[][] transposedMatrix = new double
                [this.matrixContainer[0].length]
                [this.matrixContainer.length];

        for (int row = 0; row < this.matrixContainer.length; row++) {
            for (int col = 0; col < this.matrixContainer[row].length; col++) {
                transposedMatrix[col][row] = this.matrixContainer[row][col];
            }
        }
        this.matrixContainer = transposedMatrix;
    }

    public void printOfMatrix() {
        for (double[] aRow : this.matrixContainer) {
            System.out.println(Arrays.toString(aRow));
        }
        System.out.println();
    }

}
