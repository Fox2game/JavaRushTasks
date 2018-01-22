package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //System.out.println("Введи строку");
        BufferedReader abc = new BufferedReader(new InputStreamReader(System.in));
        String ab = abc.readLine();
        //System.out.println("Введи цифру");
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(num.readLine());

        int j = 0;
        while (j < i) {
            System.out.println(ab);
            j++;
        }

    }
}
