package com.teachmeskills.lesson8;

public class Task3 extends TextFormaterUtils {
    @Override
    public boolean isPalindrome(String src) {
        if (src.length() != 0) {
            count++;
        }
      return src.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(src.replaceAll("\\W", ""))
                        .reverse().toString());
   }
}
