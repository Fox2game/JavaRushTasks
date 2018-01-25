package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 5;
        this.color = "red";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
        this.address = null;

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = null;

    }

    public Cat(int weight, String color) {
        this.age = 3;
        this.weight = weight;
        this.color = color;

    }

    public Cat(int weight, String color, String address) {
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}

