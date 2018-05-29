package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);
        //FileInputStream inputStream = new FileInputStream("D://new.txt");
        ArrayList<Integer> arr = new ArrayList<>();
        int spaces = 0;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (data == 32) spaces++;
            arr.add(data);
        }
        System.out.printf("%.2f",(float) spaces/arr.size()*100);
        inputStream.close();
    }
}
