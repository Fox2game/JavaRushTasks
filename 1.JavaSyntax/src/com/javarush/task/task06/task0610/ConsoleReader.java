package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader sbr = new BufferedReader(new InputStreamReader(System.in));
        return sbr.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader ibr = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(ibr.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader dbr = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(dbr.readLine());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bbr.readLine());
    }

    public static void main(String[] args) {

    }
}
