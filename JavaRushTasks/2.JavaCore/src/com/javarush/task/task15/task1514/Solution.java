package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put((1.5d), "ee");
        labels.put((1.6d), "d");
        labels.put((1.7d), "g");
        labels.put((1.8d), "h");
        labels.put((1.9d), "j");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
