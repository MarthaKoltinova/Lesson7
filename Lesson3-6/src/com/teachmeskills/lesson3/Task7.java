package com.teachmeskills.lesson3;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(15);
            System.out.print(array[i]+" ");
        }
            int max = array[0],index=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index=i;
                }
            }
        System.out.println("\n");
        System.out.println("Максимальное число массива: "+max+" и его индекс: "+index);
        }
    }


