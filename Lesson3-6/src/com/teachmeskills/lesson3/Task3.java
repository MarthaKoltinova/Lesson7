package com.teachmeskills.lesson3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        int count=0;
        int[] array = new int[15];
        for(int i=0;i<array.length;i++){
            Random random=new Random();
            array[i]=random.nextInt(100);
            System.out.print(array[i] +" ");
            if(array[i]>0&array[i]%2==0)
                count++;
        }
        System.out.println("\n-------------");
        System.out.println("Всего в массиве "+count+" четных");
    }
}
