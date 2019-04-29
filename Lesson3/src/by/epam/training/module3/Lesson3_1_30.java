package by.epam.training.module3;

public class Lesson3_1_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 30
		// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		// заменить их абсолютными значениями, если это не так

		double a, b, c;
		a = 3.0;
		b = -2.0;
		c = -1.0;

		if (a > b && b > c) {
			a = a * 2.0;
			b = b * 2.0;
			c = c * 2.0;
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("c=" + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("c=" + c);
		}
	}

}
