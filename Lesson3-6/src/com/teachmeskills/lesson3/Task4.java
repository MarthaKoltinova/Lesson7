package com.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if(i%2 == 1){
                array[i] = 0;
            }
        }
        System.out.println("\n---------------");
        System.out.println(Arrays.toString(array));
    }
}