package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]); //первая буква - всегда большая.
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') { //если какой-то из символов в массиве = " "
                ch[i + 1] = Character.toUpperCase(ch[i + 1]); //то следующий символ тоже в верхнем регистре.
            }
        }
        System.out.println(ch);
    }
}

