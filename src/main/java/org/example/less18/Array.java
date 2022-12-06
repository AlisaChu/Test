package org.example.less18;

public class Array {

    public int arrayAverage(int[] array) {

            if (array.length == 0) {
                return 0;
            }
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (sum / array.length);
        }
    }














