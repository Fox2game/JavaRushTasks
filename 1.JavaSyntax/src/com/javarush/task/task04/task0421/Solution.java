package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name1 = br.readLine();
		String name2 = br.readLine();
		if (name1.compareTo(name2) == 0)
			System.out.println("Имена идентичны");
		else if (name1.length() == name2.length())
			System.out.println("Длины имен равны");


	}
}
