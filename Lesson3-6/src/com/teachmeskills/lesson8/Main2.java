package com.teachmeskills.lesson8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String src = scanner.nextLine();
        task2.getCount(src);
        System.out.println(replaceAllByIndex(src, 3, 0));
    }

    public static String replaceAllByIndex(String src2, int i, int i1) {
        return src2.replace(src2.charAt(i), src2.charAt(i1));
    }
}