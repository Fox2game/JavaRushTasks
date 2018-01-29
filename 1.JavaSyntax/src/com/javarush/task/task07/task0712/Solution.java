package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        int min = list.get(0).length();
        int max = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i).length()) {
                min = list.get(i).length();
            } else if (max < list.get(i).length()) {
                max = list.get(i).length();
            }

        }
        for (String aList : list) {
            if (aList.length() == max) {
                System.out.println(aList);
                break;
            } else if (aList.length() == min) {
                System.out.println(aList);
                break;
            }
        }
    }
}
