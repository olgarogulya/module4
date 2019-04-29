package by.epam.training.module3;

public class Lesson3_1_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 20
		// Определить, делителем каких чисел а, b, с является число k

		double a, b, c, k;
		a = 7.0;
		b = 9.0;
		c = 3.0;
		k = 3.0;
		// System.out.println("a%k " + a%k);
		// System.out.println("b%k " + b%k);
		// System.out.println("c%k " + c%k);

		if (a % k == 0) {
			System.out.println("k - delitel a");
		}
		if (b % k == 0) {
			System.out.println("k - delitel b");
		}
		if (c % k == 0) {
			System.out.println("k - delitel c");
		}
	}

}
