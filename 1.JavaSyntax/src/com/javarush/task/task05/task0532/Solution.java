package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int maximum = 0;
        for (int i = 0; i < count; i++) {
            int newNum = Integer.parseInt(reader.readLine());
            maximum = (newNum > maximum || i == 0) ? newNum : maximum;
        }
        System.out.println(maximum);
    }
}
