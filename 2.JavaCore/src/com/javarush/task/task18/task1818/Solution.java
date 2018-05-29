package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //Программа должна три раза считать имена файлов с консоли.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Для первого файла создай поток для записи.
        FileOutputStream outputStream = new FileOutputStream(br.readLine(),true);
        //Для двух других - потоки для чтения.
        FileInputStream inputStream1 = new FileInputStream(br.readLine());
        FileInputStream inputStream2 = new FileInputStream(br.readLine());

        br.close();
        //Содержимое второго файла нужно переписать в первый файл.
        while (inputStream1.available() > 0) {
            int read = inputStream1.read();
            outputStream.write(read);
        }
        //Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
        while (inputStream2.available()>0){
            int read = inputStream2.read();
            outputStream.write(read);
        }
        //Созданные для файлов потоки должны быть закрыты.
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }
}
