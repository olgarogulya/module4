package by.epam.training.module3;

public class Lesson3_1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 13
		// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		// которая из точек находится ближе к началу координат

		double x1, y1;
		double x2, y2;

		x1 = 3.0; // A
		y1 = -4.0;

		x2 = 4.0; // B
		y2 = -3.0;

		double c1 = Math.sqrt(x1 * x1 + y1 * y1);
		// System.out.println(c1);

		double c2 = Math.sqrt(x2 * x2 + y2 * y2);
		// System.out.println(c2);

		if (c1 < c2) {
			System.out.println("A");
		}
		if (c1 > c2) {
			System.out.println("B");
		} else if (c1 == c2) {
			System.out.println("A and B are at the same distance");
		}

	}

}
