package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //я не очень люблю вложенные циклы
        //я знаю, что это говнокод
        int i = 0;
        while (i < 100) {
            System.out.print("S");
            i++;
            //при десятке начинаем новую строку
            if (i % 10 == 0) System.out.println("");
        }

    }
}
