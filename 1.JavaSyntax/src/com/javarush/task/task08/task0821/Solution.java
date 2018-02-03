package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        people.put("Фамилия0", "Имя0");
        people.put("Голуб", "Кирилл");
        people.put("Фамилия1", "Имя1");
        people.put("Фамилия2", "Имя2");
        people.put("Фамилия3", "Имя3");
        people.put("Фамилия4", "Имя4");
        people.put("Фамилия5", "Имя5");
        people.put("Фамилия6", "Имя6");
        people.put("Голуб", "Кирилл");
        people.put("Фамилия8", "Имя8");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
