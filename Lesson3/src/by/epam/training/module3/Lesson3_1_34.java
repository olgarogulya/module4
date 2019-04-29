package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 34
		// Составить программу, реализующую эпизод применения компьютера в книжном
		// магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
		// покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
		// денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
		// указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
		// и указывает размер недостающей суммы

		System.out.println("Enter stoimost knigi");
		Scanner sa = new Scanner(System.in);
		double a = sa.nextDouble();

		System.out.println("Enter vnesennaya summa");
		Scanner sb = new Scanner(System.in);
		double b = sb.nextDouble();

		double z = a - b;

		if (z == 0.0) {
			System.out.println("spasibo");
		}
		if (z > 0.0) {
			System.out.println("nedostatochnaya summa, vnesite: " + z);
		}
		if (z < 0.0) {
			System.out.println("vozmite sdachu: " + z);
		}
	}

}
