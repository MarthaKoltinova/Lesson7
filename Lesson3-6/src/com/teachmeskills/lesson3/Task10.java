package com.teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;
        while (n <= 3) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Введите число. Повторите ввод:");
                scanner.next();
            }
        }
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n) + 1;
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(Arrays.toString(array));
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}

