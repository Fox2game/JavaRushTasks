package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		int j = Integer.parseInt(br.readLine());
		if (i > j)
			System.out.println(j);
		else if (i < j)
			System.out.println(i);
		else System.out.println(i);
	}
}