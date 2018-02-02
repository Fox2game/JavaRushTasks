package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            arr.add(num);
        }
        int a = arr.get(0);
        int b = 1;
        int c = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (a == arr.get(i)) b++;
            if (b > c) c = b;
            if (a != arr.get(i)) {
                a = arr.get(i);
                b = 1;
            }
        }
        System.out.println(c);
    }
}