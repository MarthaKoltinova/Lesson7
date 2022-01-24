package com.teachmeskills.lesson8;

import java.util.Scanner;

public class Task2 extends TextFormaterUtils {
    @Override
    public void getCount(String src) {
        if (src.length() != 0) {
            count++;
        }
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Количество слов:" + count);

    }
}