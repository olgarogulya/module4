package by.epam.training.module3;

public class Lesson3_1_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 28
		// Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		// равно d, то найти max(d — a, d — b, d —c)

		double a, b, c, d;
		double a1, a2, a3;
		a = 7.0;
		b = 8.0;
		c = 9.0;
		d = 10.0;
		if (a == d) {
			System.out.println("a = d");
		}
		if (b == d) {
			System.out.println("b = d");
		}
		if (c == d) {
			System.out.println("c = d");
		} else {
			a1 = Math.max(d - a, d - b);
			a2 = Math.max(a1, d - c);
			a3 = Math.max(a1, a2);
			System.out.println(a3);
		}
	}

}
