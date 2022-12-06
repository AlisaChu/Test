package org.example.less18;
public class Main {

    public static void main(String[] args) {
        int[] exempleArray1 = {5, 20, 87, 100, 13};
        int[] exempleArray2 = new int[0];
        int[] exempleArray3 = new int[2];
        Array array = new Array();
        array.arrayAverage(exempleArray1);
        array.arrayAverage(exempleArray2);
        array.arrayAverage(exempleArray3);



        int[][] exempleMatrix = {{60, 100,12}, {100, 60,123}, {12,100, 60}};
        int[][] exempleMatrix2 = {{60, 100,12}, {100, 60}, {12,100}};
        Matrix matrix = new Matrix();
        matrix.matrixSquare(exempleMatrix);
        matrix.matrixSquare(exempleMatrix2);
    }
}
