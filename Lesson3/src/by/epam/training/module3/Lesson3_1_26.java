package by.epam.training.module3;

public class Lesson3_1_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 26
		// Написать программу нахождения суммы большего и меньшего из трех чисел

		double a, b, c;
		double a1, a2, a3, b1, b2, b3, c3;
		a = 6.0;
		b = 7.0;
		c = 1.0;

		a1 = Math.max(a, b);
		a2 = Math.max(a1, c);
		a3 = Math.max(a1, a2);

		b1 = Math.min(a, b);
		b2 = Math.min(b1, c);
		b3 = Math.min(b1, b2);

		c3 = a3 + b3;
		System.out.println(c3);

	}

}
