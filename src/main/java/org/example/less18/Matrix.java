package org.example.less18;

public class Matrix {
    public void matrixSquare(int[][] array) {
        int lenght = array.length;
        boolean isSquare = true;
        if (lenght == 0) {
            System.out.println("The matrix is empty, at least some elements are needed");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (lenght != array[i].length) {
                    isSquare = false;
                    System.out.println("The matrix is not square");
                    break;
                }
            }
            if (isSquare) {
                System.out.println("Matrix square");
            }
        }
    }
}