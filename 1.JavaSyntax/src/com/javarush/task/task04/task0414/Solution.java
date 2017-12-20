package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		if ((a % 4) != 0) //Если деление на 4 не 0 - однозначно "Не високосный"
			System.out.println("количество дней в году: 365");
		else if ((a % 100) != 0) // Проверяем: столетие ли это?
			System.out.println("количество дней в году: 366");
		else if ((a % 400) != 0) //рассматривается вариант, когда остаток от деления на 400 = 0
			System.out.println("количество дней в году: 365");
		else
			System.out.println("количество дней в году: 366");
	}
}
