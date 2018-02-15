package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private static String name;
        private static String address;
        private static int age;
        private static int sex;
        private static Human mother;
        private static Human father;

        public Human(String name, int age, int sex) {
        }

        public Human(String name, int age, int sex, String address) {
        }

        public Human(String name, int age, String address) {
        }

        public Human(String name, int sex) {
        }

        public Human(int age, int sex) {
        }

        public Human(int age, int sex, String address) {
        }

        public Human(String name, int age, int sex, Human mother, Human father) {
        }

        public Human(String name, Human mother) {
        }

        public Human(String name, int age, Human mother) {
        }

        public Human(String name, String address, Human mother) {
        }
    }
}
