package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 33
		// Написать программу, которая по паролю будет определять уровень доступа
		// сотрудника к секретной информации в базе данных. Доступ к базе имеют только
		// шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
		// пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
		// модули баз В, С; 9455, 8997 — доступен модуль базы С.

		System.out.println("Enter password");
		Scanner sa = new Scanner(System.in);
		int n = sa.nextInt();

		// pass 9583, 1747 - A, B, C
		// pass 3331, 7922 - B, C
		// pass 9455, 8997 - C

		if (n == 9583 || n == 1747) {
			System.out.println("dostup k bazam A, B, C");
		} else if (n == 3331 || n == 7922) {
			System.out.println("dostup k bazam B, C");
		} else if (n == 9455 || n == 8997) {
			System.out.println("dostup k baze C");
		} else {
			System.out.println("net dostupa k bazam");
		}
	}

}
