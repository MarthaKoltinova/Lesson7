package com.teachmeskills.lesson3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int[] array = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < array2.length; i++) {
            Random random = new Random();
            array2[i] = random.nextInt(15);
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n");
        calculation.equalsAVG(calculation.avg(array), calculation.avg(array2));
    }

    public static class Calculation {
        public int avg(int[] array) {
            int result = 0;
            for (int i : array) {
                result += i;
            }
            return result / array.length;
        }

        public void equalsAVG(int a, int b) {
            if (a > b) {
                System.out.println("Среднее значение чисел первого массива больше, чем среднее значение чисел второго " + a + ">" + b);
            } else if (a < b) {
                System.out.println("Среднее значение чисел второго массива больше, чем среднее значение чисел первого " + b + ">" + a);
            } else {
                System.out.println("Среднее значение чисел равны " + a + "=" + b);
            }
        }
    }
}


