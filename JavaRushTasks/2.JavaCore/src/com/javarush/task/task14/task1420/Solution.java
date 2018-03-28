package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = 0;
        int second = 0;
        try {
            first = Integer.parseInt(br.readLine());
            second = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }

        if (first <= 0 || second <= 0) throw new Exception();

        System.out.println(GCD.gcd(first, second));
    }

    public static class GCD {
        static int gcd(int first, int second) {
            while (second != 0) {                               // Алгоритм Евклида и его реализация
                int tmp = first % second;
                first = second;
                second = tmp;
            }
            return first;
        }
    }
}
