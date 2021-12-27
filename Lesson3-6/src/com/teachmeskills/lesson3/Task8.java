package com.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[10];
        double[] array3= new double[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9);
            array2[i] = random.nextInt(9);
            array3[i]=(double) array[i]/array2[i];
        }
       int amountOfElements=0;
        for (int i = 0; i < array3.length; i++)
            if (array3[i]%1==0)
                amountOfElements++;
        System.out.print(Arrays.toString(array));
        System.out.print(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("Количество целых элементов в третьем массиве: "+ amountOfElements);
        }
    }
