package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //Какой же это геморрой...
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i != -1; i++) {
            int a = Integer.parseInt(buf.readLine());
            sum += a;
            if (a == -1) break;
        }
        System.out.println(sum);
    }
}
