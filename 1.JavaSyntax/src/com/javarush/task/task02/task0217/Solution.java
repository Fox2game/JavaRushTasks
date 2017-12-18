package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        if (min(a,b)<c) {
            if (min(a,b)<d)
                return min(a,b);
            else
                return d;
        }
        else {
            if (c<d)
                return c;
            else
                return d;
        }
    }
    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a<b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}