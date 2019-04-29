package by.epam.training.module3;

public class Lesson3_1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 11
		// Составить программу, которая определит площадь какого треугольника больше

		double h1 = 5.0;
		double a1 = 5.0;
		double s1 = a1 * h1 / 2;
		// System.out.println(s1);

		double h2 = 5.0;
		double a2 = 5.0;
		double s2 = a2 * h2 / 2;
		// System.out.println(s2);

		if (s2 > s1) {
			System.out.println("площадь треугольника 1 меньше");
		} else if (s2 < s1) {
			System.out.println("площадь треугольника 1 меньше");
		} else {
			System.out.println("площади треугольников равны");
		}
	}

}
