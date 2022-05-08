package oop.labor11.lab11_5;

public class Main {
    public static void main(String[] args) throws MatrixException {
        Matrix matrix1 = new Matrix(3, 2);
        Matrix matrix2 = new Matrix(4, 1);
        matrix1.fillRandom(3, 2);
        matrix2.fillRandom(4, 1);
        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();

        try {
            Matrix.add(matrix1, matrix2);
            Matrix.multiply(matrix1, matrix2);
        } catch (MatrixException e){
            System.out.println("Improper matrix dimensions!");
        }
    }
}
