package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int i = 0;
        while (true) { //Бесконечные циклы - не хорошо, но нужно.
            int a = Integer.parseInt(r.readLine());
            if (a != -1) {
                sum += a;
                i++;
            } else break;
        }
        System.out.println(sum / i);
    }
}

