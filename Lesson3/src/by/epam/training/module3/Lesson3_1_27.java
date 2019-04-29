package by.epam.training.module3;

public class Lesson3_1_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 27
		// Найти max{min(a, b), min(c, d)}
		
		double a, b, c, d;
		double a1, a2, a3;
		a = 6.0;
		b = 7.0;
		c = 1.0;
		d = 10.0;

		a1 = Math.min(a, b);
		a2 = Math.min(c, d);
		a3 = Math.max(a1, a2);

		System.out.println(a3);
	}
}
