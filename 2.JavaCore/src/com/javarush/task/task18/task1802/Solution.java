package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(br.readLine());
        int min = 0 , data;

        if(fileInputStream.available()>0)
            min=fileInputStream.read();
        while(fileInputStream.available()>0)
            if((data=fileInputStream.read())<min)
                min =data;
        fileInputStream.close();
        br.close();
        System.out.println(min);
    }
}
