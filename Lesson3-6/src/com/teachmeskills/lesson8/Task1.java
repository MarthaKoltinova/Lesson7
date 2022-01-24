package com.teachmeskills.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 extends TextFormaterUtils {
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
        // return count;
    }

    public void getChars(String src) {
        char[] src1 = new char[src.length()];
        src.getChars(0, src.length(), src1, 0);
        System.out.println(Arrays.toString(src1));

    }
}


