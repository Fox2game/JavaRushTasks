package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(7);
        print(new Integer(4));
    }

    //Напишите тут ваши методы
    public static void print(int i){
        System.out.print(i);
    }
    public static void print(Integer N){
        System.out.println(N);
    }

}
