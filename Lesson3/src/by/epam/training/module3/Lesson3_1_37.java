package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 37
		// Вычислить значение функции z=-1*x*x-3*x+9 при x<=3 и z=1/(x*x*x-6) при x>3

		System.out.println("Enter x");
		Scanner sa = new Scanner(System.in);
		double x = sa.nextDouble();
		double z;

		if (x >= 3.0) {
			z = -1.0 * x * x - 3.0 * x + 9.0;

		} else {
			z = 1.0 / (x * x * x - 6.0);

		}
		System.out.println(z);
	}

}
