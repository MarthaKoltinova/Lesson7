package com.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 0, part, sum1 = 0, sum2 = 0;
        do {
            System.out.println("Введите положительное число ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    int[] array = new int[number];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(15);
                        System.out.println(array[i] + " ");
                    }
                    part = array.length / 2;
                    for (int i = 0; i < part; i++) {
                        sum1 = sum1 + Math.abs(array[i]);
                    }
                    for (int i = part; i < array.length; i++) {
                        sum2 = sum2 + Math.abs(array[i]);
                    }
    if (sum1>sum2){
        System.out.println("Сумма первого модуля больше второго");
    }
    else if (sum1<sum2){
        System.out.println("Сумма второго модуля больше первого");
    }
    else {
        System.out.println("Сумма модулей равна");
    }
                }
            }
        }
        while (number<=0);
    }
}