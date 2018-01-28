package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello ");
        arr.add("World!");
        arr.add("...");
        arr.add("My name is ");
        arr.add("Kirill");
        System.out.println(arr.size());
        for (String anArr : arr) {
            System.out.println(anArr);
        }
    }
}
