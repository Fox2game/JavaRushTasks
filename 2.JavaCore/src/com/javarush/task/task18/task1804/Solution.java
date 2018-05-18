package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(
                new BufferedReader(new InputStreamReader(System.in)).readLine());
        Map<Byte, Integer> data = new HashMap<>();
        ArrayList<Byte> list = new ArrayList<>();


        while (fileInputStream.available() > 0)
        {
            list.add((byte)fileInputStream.read());
        }
        fileInputStream.close();

        int count;
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            data.put(list.get(i),count);
        }

        int min = Collections.min(data.values());
        for (Map.Entry<Byte,Integer> pair: data.entrySet()) {
            if(pair.getValue() == min)
                System.out.print(pair.getKey() + " ");
        }
    }
}

