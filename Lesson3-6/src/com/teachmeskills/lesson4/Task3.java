package com.teachmeskills.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int a;
        int productOfNumbers = 1;
        int productOfNumbers2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        a = scanner.nextInt();
        int[][] matrix = new int[a][a];
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //главная диагональ
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (i == j) {
                    productOfNumbers = productOfNumbers * matrix[i][j];
                }
            }
        }
        //побочная
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (i + j + 1 == a) {
                    productOfNumbers2 = productOfNumbers2 * matrix[i][j];
                }
            }
        }
        if (productOfNumbers > productOfNumbers2) {
            System.out.println("Произведение элементов главной диагонали больше побочной :" + productOfNumbers + ">" + productOfNumbers2);
        } else if (productOfNumbers < productOfNumbers2) {
            System.out.println("Произведение элементов побочной диагонали больше главной :" + productOfNumbers + "<" + productOfNumbers2);
        } else {
            System.out.println("Произведения равны" + productOfNumbers + "=" + productOfNumbers2);
        }
    }
}