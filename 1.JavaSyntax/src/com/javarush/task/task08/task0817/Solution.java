package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Kirill", "Golub1");
        map.put("Sasha", "Golub");
        map.put("Sveta", "Golub");
        map.put("Anya", "Brusilovskaya1");
        map.put("Tanya", "Brusilovskaya1");
        map.put("Valya", "Brusilovskaya2");
        map.put("Olya", "Brusilovskaya3");
        map.put("Serezha", "Brusilovskaya");
        map.put("Varya", "Brusilovskaya");
        map.put("Rita", "Brusilovskaya");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<>(map.values());
        ArrayList<String> needDelete = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);

            for (int j = i + 1; j < names.size(); j++) {
                if (s.equals(names.get(j)))
                    needDelete.add(s);
            }
        }

        for (int i = 0; i < needDelete.size(); i++)
            removeItemFromMapByValue(map, needDelete.get(i));
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
