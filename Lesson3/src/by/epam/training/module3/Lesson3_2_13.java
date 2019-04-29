package by.epam.training.module3;

public class Lesson3_2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_13
		// составить таблицу значений функции y = 5 - x*x/2 на отрезке [-5; 5] с шагом 0.5

		double x, y, a, b, h;
		a = -5.0;
		b = 5.0;
		h = 0.5;

		for (x = a; x <= b; x = x + h) {
			//System.out.println("x=" + x);

			y = 5 - x * x / 2;
			//System.out.println("y=" + y);

			System.out.println("------------------");
			System.out.println("x=" + x + " | " + "y=" + y);
			//System.out.println("------------------");
		}
		System.out.println("------------------");
	}

}
