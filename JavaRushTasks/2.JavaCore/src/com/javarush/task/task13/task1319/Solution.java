package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()));
        String word;
        do {
            word = br.readLine();
            bw.write(word);
            bw.newLine();
            bw.flush();
        }
        while (!word.equals("exit"));
        br.close();
        bw.close();
    }
}
