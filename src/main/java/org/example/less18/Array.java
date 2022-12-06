package org.example.less18;

public class Array {
    public void arrayAverage(int[] array) {
        if (array.length == 0) {
            System.out.println("This array cannot have averages because its length is 0");
        }else{
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Average equals " + sum / array.length);
        }
    }
}









