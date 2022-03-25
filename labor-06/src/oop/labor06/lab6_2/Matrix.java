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
                data[i][j] = rand.nextInt(100);
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
                System.out.printf("%.2f ", data[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix m1, Matrix m2){
        if (m1.rows != m2.rows || m1.columns != m2.columns){
            System.out.println("The two matrixes can not be added together!");
            return null;
        }
        Matrix matrix = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                matrix.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return matrix;
    }

    public static Matrix multiply(Matrix m1, Matrix m2){
        Matrix matrix = new Matrix(m1.rows, m2.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.columns; j++) {
                for (int k = 0; k < m2.rows; k++) {
                    matrix.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return matrix;
    }

    public static Matrix transpose(Matrix m){
        Matrix matrix = new Matrix(m.columns, m.rows);
        for (int i = 0; i < m.columns; i++) {
            for (int j = 0; j < m.rows; j++) {
                matrix.data[i][j] = m.data[j][i];
            }
        }
        return matrix;
    }
}
