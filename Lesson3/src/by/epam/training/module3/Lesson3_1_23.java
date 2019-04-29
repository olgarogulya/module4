package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 23
		// определить правильность даты введенной с клавиатуры, (число от 1 до 31,
		// месяц - от 1 до 12). Если введены некорректные данные, то сообщить об этом.

		System.out.println("Введите день от 1 до 31");
		Scanner sa = new Scanner(System.in);
		int d = sa.nextInt();

		System.out.println("Введите месяц от 1 до 12");
		Scanner sb = new Scanner(System.in);
		int m = sb.nextInt();

		if (d >= 1 && d <= 31 && m >= 1 && m <= 12) {
			System.out.println("Дата введена правильно");
		} else {
			System.out.println("Дата введена неверно");
		}
	}

}
