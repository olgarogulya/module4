package by.epam.training.module3;

public class Lesson3_2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_07
		// Вычислить значения функции на отрезке [a, b] с шагом h

		double x, y, a, b, h;
		a = -5.0;
		b = 5.0;
		h = 1.0;

		for (x = a; x <= b; x = x + h) {
			System.out.println("x=" + x);
			if (x > 2.0) {
				y = x;
				System.out.println("y=" + y);
			} else {
				y = -1 * x;
				System.out.println("y=" + y);
			}

		}
	}
}
