package by.epam.training.module3;

public class Lesson3_1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 15
		// Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
		// чисел заменить половиной их суммы, а большее — их удвоенным произведением

		double x, y;
		x = 8.0;
		y = 9.0;

		double z = Math.min(x, y);

		if (x != y) {
			if (x == z) {
				x = (x + y) / 2;
				y = x * y * 2;
				System.out.println("x=" + x);
				System.out.println("y=" + y);
			}
			if (y == z) {
				y = (x + y) / 2;
				x = x * y * 2;
				System.out.println("x=" + x);
				System.out.println("y=" + y);
			}
		}
	}
}
