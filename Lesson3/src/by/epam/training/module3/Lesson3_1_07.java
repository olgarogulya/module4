package by.epam.training.module3;

public class Lesson3_1_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7
		// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
		// значениях a, b, c и х

		double a, b, c, x, y;
		a = -5;
		b = -6;
		c = -7;
		x = -8;

		y = Math.abs(a * x * x + b * x + c);
		System.out.println(y);

	}

}
