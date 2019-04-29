package by.epam.training.module3;

public class Lesson3_1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 12
		// Даны три действительных числа. Возвести в квадрат те из них, значения которых
		// неотрицательны, и в четвертую степень — отрицательные

		double a;
		double b;
		double c;

		a = -3.0;
		b = 5.0;
		c = 6.0;

		if (a >= 0) {
			double a1 = a * a;
			System.out.println("a squared " + a1);
		} else {
			double a2 = Math.pow(a, 4);
			System.out.println("a in the fourth degree " + a2);
		}
		if (b >= 0) {
			double b1 = b * b;
			System.out.println("b squared " + b1);
		} else {
			double b2 = Math.pow(b, 4);
			System.out.println("b in the fourth degree " + b2);
		}
		if (c >= 0) {
			double c1 = c * c;
			System.out.println("c squared " + c1);
		} else {
			double c2 = Math.pow(c, 4);
			System.out.println("c in the fourth degree " + c2);
		}
	}

}
