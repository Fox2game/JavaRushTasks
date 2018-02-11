package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(new int[]{2, 34, 5, 7, 6});
        arr.add(new int[]{5, 54});
        arr.add(new int[]{22, 12, 77, 67});
        arr.add(new int[]{234, 344, 5, 75, 67, 909, 0});
        arr.add(new int[0]);
        return arr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
