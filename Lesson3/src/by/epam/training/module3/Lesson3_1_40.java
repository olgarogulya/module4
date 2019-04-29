package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 40
		// Вычислить значение функции z=-1*Math.pow(x,3)+9 при x<=13 и z=-3/(x+1) при
		// x>13

		System.out.println("Enter x");
		Scanner sa = new Scanner(System.in);
		double x = sa.nextDouble();
		double z;

		if (x <= 13.0) {
			z = -1 * Math.pow(x, 3) + 9.0;
		} else {
			z = -3 / (x + 1);
		}
		System.out.println(z);
	}

}
