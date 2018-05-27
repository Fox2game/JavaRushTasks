package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(br.readLine());

        int result = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (data == 44){ result++; }
        }
        br.close();
        inputStream.close();

        System.out.println(result);
    }
}
