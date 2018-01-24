package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    /*
                     ЗАМЕТКИ НА ПОЛЯХ
    * Если принимаем параметром переменную в круглых скобках,
    * то инициализируем через неё
    * (public void initialize (String name) {this.name = name;}) ,
    * в противном случае задаём новое значение
    */
    String name;
    String color;
    int height;

    public static void main(String[] args) {

    }

    public void initialize(String name) {
        this.name = name;
        this.color = "black";
        this.height = 5;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.color = "black";
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
}
