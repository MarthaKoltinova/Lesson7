package com.teachmeskills.lesson3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        boolean isGrowing=true;
        for (int i = 1; i <array.length; i++) {
            if (array[i]<=array[i-1]){
                isGrowing=false;
                break;
            }
        }
        System.out.println("\n--------------");
        if (isGrowing){
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}