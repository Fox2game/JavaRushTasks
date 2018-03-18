package com.javarush.task.task13.task1320;

/* 
Neo
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Matrix.NEO);
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {

            return String.format("User has name %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.name = name;
            this.id = id;
            return this; // возвращается ссылка на объект который метод вызывает.
        }
    }
}
