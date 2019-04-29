package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_06
		// Напишите программу, где пользователь вводит любое целое положительное число.
		// А программа суммирует все числа от 1 до введенного пользователем числа

		System.out.println("Enter positive integer");
		Scanner sa = new Scanner(System.in);
		int n = sa.nextInt();
		int c = 0;

		for (int a = 1; a <= n; a++) {
			c = c + a;

			System.out.println(c);
		}
		System.out.println(c);

	}

}
