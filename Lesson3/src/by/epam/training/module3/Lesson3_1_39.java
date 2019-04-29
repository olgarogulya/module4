package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 39
		// Вычислить значение функции z=-1*x*x+x-9 при x>=8, иначе
		// z=1/(Math.pow(x,4)-6*6)

		System.out.println("Enter x");
		Scanner sa = new Scanner(System.in);
		double x = sa.nextDouble();
		double z;

		if (x >= 8.0) {
			z = -1 * x * x + x - 9.0;
		} else {
			z = 1 / (Math.pow(x, 4) - 6 * 6);
		}
		System.out.println(z);
	}

}
