package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {
            try {
                int num = Integer.parseInt(br.readLine());
                arrayList.add(num);

            } catch (Exception e) {
                for (Integer i : arrayList) {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
