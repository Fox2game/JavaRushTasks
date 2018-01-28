package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int b = 0, c = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                b = b + arr[i];
            } else c = c + arr[i];
        }
        System.out.println(b > c ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");
    }
}
