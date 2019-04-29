package by.epam.training.module3;

public class Lesson3_1_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 29
		// Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить лежат ли они на одной
		// прямой.

		double ab, bc, ac, x1, y1, x2, y2, x3, y3;

		double p;
		double s;

		x1 = 3;
		y1 = 3;
		x2 = 2;
		y2 = 1;
		x3 = 5;
		y3 = 5;

		ab = Math.hypot(Math.abs(x2 - x1), Math.abs(y2 - y1));
		bc = Math.hypot(Math.abs(x3 - x2), Math.abs(y3 - y2));
		ac = Math.hypot(Math.abs(x3 - x1), Math.abs(y3 - y1));

		p = (ab + bc + ac) / 2;

		s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));

		// System.out.println("S " + s);

		if (s == 0) {
			System.out.println("tochki lezhat na odnoi pryamoi");
		}
		System.out.println("tochki ne lezhat na odnoi pryamoi");
	}
}
