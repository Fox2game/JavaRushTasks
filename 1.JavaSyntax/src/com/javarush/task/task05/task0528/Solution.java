package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //System.out.println(26 + " " + "01" + " " + 2018); // "Работает - не трогай"
        System.out.println(new SimpleDateFormat("DD MM YYYY").format(new Date()));
    }
}
