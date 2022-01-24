package com.teachmeskills.lesson8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String src = scanner.nextLine();
        Task1 task1 = new Task1();
        task1.getCount(src);
        task1.getChars(src);

    }
}
