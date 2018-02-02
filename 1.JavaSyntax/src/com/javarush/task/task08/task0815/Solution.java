package com.javarush.task.task08.task0815;

import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Kirill", "Golub");
        map.put("Sasha", "Golub");
        map.put("Sveta", "Golub");
        map.put("Anya", "Brusilovskaya");
        map.put("Tanya", "Brusilovskaya");
        map.put("Valya", "Brusilovskaya");
        map.put("Olya", "Brusilovskaya");
        map.put("Serezha", "Brusilovskaya");
        map.put("Varya", "Brusilovskaya");
        map.put("Rita", "Brusilovskaya");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int a = 0;
        for (String s : map.values()) {
            if (s.equals(name)) a++;
        }
        return a;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int b = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) b++;
        }
        return b;

    }

    public static void main(String[] args) {

    }
}
