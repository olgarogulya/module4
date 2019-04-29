package by.epam.training.module3;

public class Lesson3_2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_12
		// Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
		// Составьте программу нахождения произведения первых 10 членов этой
		// последовательности.

		int a = 1;
		long b = 1;
		b = b * a;
		int n = 1;
		// System.out.println("a" + n + "=" + a);
		for (n = 2; n <= 10; n++) {
			a = 6 + a;
			b = b * a;
			// System.out.println("a" + n + "=" + a);
			// System.out.println("b " + b);
		}
		System.out.println("b " + b);
	}

}
