package by.epam.training.module3;

public class Lesson3_1_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 32
		// Написать программу, которая по заданным трем числам определяет, является ли
		// сумма каких-либо двух из них положительной

		double a, b, c;
		a = 3.0;
		b = -2.0;
		c = -1.0;

		if ((a + b) > 0) {
			System.out.println("a + b > 0");
		}
		if ((a + c) > 0) {
			System.out.println("a + c > 0");
		}
		if ((b + c) > 0) {
			System.out.println("b + c > 0");
		}
	}

}
