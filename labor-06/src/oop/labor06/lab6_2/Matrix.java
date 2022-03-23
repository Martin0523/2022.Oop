package oop.labor06.lab6_2;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix(Matrix matrix){
        this.data = matrix.data;
        this.rows = matrix.rows;
        this.columns = matrix.columns;
    }

    public void fillRandom(double rows, double columns){
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = rand.nextInt();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%f2", data[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m1, Matrix m2){
        Matrix matrix = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                matrix.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return matrix;
    }
}
