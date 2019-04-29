package by.epam.training.module3;

public class Lesson3_2_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_08
		// Вычислить значение функции на отрезке [a, b] с шагом h

		double x, y, a, b, c, h;
		a = -20.0;
		b = 20.0;
		h = 5.0;
		c = 2;

		for (x = a; x <= b; x = x + h) {
			System.out.println("x=" + x);
			if (x == 15.0) {
				y = (x + c) * 2;
				System.out.println("y=" + y);
			} else {
				y = (x - c) + 6;
				System.out.println("y=" + y);
			}

		}
	}
}
