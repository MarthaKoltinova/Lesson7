package com.teachmeskills.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int a;
        int sum = 0;
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
        for (int i = 1; i < matrix.length;i++) {
            for (int j = 0; j < i ; j++) {
                if (matrix[i][j] % 2 != 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
