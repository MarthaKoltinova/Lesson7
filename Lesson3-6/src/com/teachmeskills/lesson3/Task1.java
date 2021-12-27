package com.teachmeskills.lesson3;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0, b = 2;
        while (i < 10) {
            array[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 10; i++)
            System.out.print(array[i] + " ");
        System.out.println("\n-------");
        for (i = 0; i < 10; i++)
            System.out.println(array[i]);
    }
}


