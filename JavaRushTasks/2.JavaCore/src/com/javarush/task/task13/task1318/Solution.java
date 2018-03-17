package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream instream = new FileInputStream(br.readLine());
        while (instream.available() > 0) {
            System.out.write(instream.read());
        }
        System.out.println();
        br.close();
        instream.close();
    }
}