package com.teachmeskills.lesson8;

import java.util.Scanner;

public class Main3 {
    int count = 0;

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String src = scanner.nextLine();
        System.out.println(task3.isPalindrome(src));

    }
}
