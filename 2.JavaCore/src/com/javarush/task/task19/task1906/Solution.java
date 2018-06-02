package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(br.readLine());
        FileWriter fileWriter = new FileWriter(br.readLine());
        br.close();
        for (int i = 1; fileReader.ready() ; i++) {
            int data = fileReader.read();
            if (i%2==0){fileWriter.write(data);}
        }
        fileReader.close();
        fileWriter.close();
    }
}
