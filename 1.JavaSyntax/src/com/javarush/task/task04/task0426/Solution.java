package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//напишите тут ваш код
		//дрочим на тернарный оператор (надеюсь это никто не найдёт)
		//извините за быдлокод, я больше так не буду
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		System.out.println
				(i == 0 ? "ноль" :
						(i > 0 ? (i % 2 == 0 ? "положительное четное число" : "положительное нечетное число") :
								(i % 2 == 0 ? "отрицательное четное число" : "отрицательное нечетное число")));
	}
}
