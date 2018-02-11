package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put("кот0", new Cat("Барсек"));
        map.put("кот1", new Cat("Барсек2"));
        map.put("кот2", new Cat("Барсек3"));
        map.put("кот3", new Cat("Барсек4"));
        map.put("кот4", new Cat("Барсек5"));
        map.put("кот5", new Cat("Барсек6"));
        map.put("кот6", new Cat("Барсек7"));
        map.put("кот7", new Cat("Барсек8"));
        map.put("кот8", new Cat("Барсек9"));
        map.put("кот9", new Cat("Барсек10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
