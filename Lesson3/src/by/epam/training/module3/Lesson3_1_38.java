package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 38
		// Вычислить значение функции z=x*x при x от 0 до 3, иначе z=4

		System.out.println("Enter x");
		Scanner sa = new Scanner(System.in);
		double x = sa.nextDouble();
		double z;

		if (x >= 0 && x <= 3.0) {
			z = x * x;
		} else {
			z = 4.0;
		}
		System.out.println(z);
	}

}
