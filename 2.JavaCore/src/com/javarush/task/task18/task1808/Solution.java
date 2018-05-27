package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(br.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(br.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(br.readLine());

        byte[] buffer = new byte[inputStream1.available()];
        if (inputStream1.available()>0){
            int count = inputStream1.read(buffer);

            outputStream2.write(buffer, 0, count - count / 2);
            outputStream3.write(buffer, count - count / 2, count - (count - count / 2));

        }
        br.close();
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
