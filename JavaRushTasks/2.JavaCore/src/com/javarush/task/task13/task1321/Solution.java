package com.javarush.task.task13.task1321;


/* 
Исправление ошибок
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
