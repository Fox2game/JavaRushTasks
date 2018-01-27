package com.javarush.task.task06.task0619;

/* 
Три статические переменных name
*/

public class Solution {

    public static String name = Solution.name;

    public static void main(String[] args) {

    }

    public static class Cat {
        public static String name = Cat.name;
    }

    public static class Dog {
        public static String name = Dog.name;
    }
}
