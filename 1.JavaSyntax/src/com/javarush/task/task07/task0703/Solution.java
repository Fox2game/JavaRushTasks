package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarr = new String[10];
        int[] iarr = new int[10];
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = br.readLine();
            iarr[i] = sarr[i].length();
        }
        for (int array : iarr) {
            System.out.println(array);
        }
    }
}
