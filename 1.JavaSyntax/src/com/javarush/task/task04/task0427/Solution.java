package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		//я не могу в тернарный оператор, мне стыдно за потраченый час.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n > 0 && n < 1000)
			System.out.print((n % 2 == 0 ? "четное " : "нечетное ") + (n < 10 ? "однозначное " : n < 100 ? "двузначное " : "трехзначное ") + "число");


	}
}
