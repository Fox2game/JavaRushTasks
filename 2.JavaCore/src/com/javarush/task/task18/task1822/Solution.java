package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                arr.add(line);
            }
            for (String id: arr) {
                if (id.startsWith(args[0] + " ")){
                    System.out.println(id);
                }
            }
        }
    }
}
