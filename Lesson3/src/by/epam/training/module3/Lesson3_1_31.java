package by.epam.training.module3;

public class Lesson3_1_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 31
		// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		// Определить, пройдет ли кирпич через отверстие

		int A, B, x, y, z;
		A = 5;
		B = 6;

		x = 6;
		y = 6;
		z = 6;

		// (A >= x && B >= y)
		// (B >= x && A >= y)
		// (A >= y && B >= z)
		// (A >= z && B >= x)
		// (A >= z && B >= y)
		// (A >= x && B >= z)

		if ((A >= x && B >= y) || (B >= x && A >= y) || (A >= y && B >= z) || (A >= z && B >= x) || (A >= z && B >= y)
				|| (A >= x && B >= z)) {
			System.out.println("kirpich proidet cherez otverstie");
		} else {
			System.out.println("kirpich ne proidet cherez otverstie");
		}
	}

}
