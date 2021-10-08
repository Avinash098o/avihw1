package com.company;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int [] array1={4,5,6,7,8};
        int[] array2={1,2,3,4};
        int[] arrayTotal= new int[array1.length+array2.length];
        int arraySize =0;

        for (int i = 0; i < array1.length; i++) {
            arrayTotal[arraySize++]=array1[i];
        }
            for (int j = 0; j < array2.length; j++) {
                arrayTotal[arraySize++]=array2[j];
            }
            Arrays.sort(arrayTotal);
        System.out.println(Arrays.toString(arrayTotal));


    }
}
