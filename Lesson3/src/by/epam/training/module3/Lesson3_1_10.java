package by.epam.training.module3;

public class Lesson3_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10
		// Составить программу, которая определит площадь какого круга меньше

		double r1 = 7.0;
		double s1 = Math.PI * r1 * r1;
		// System.out.println(s1);

		double r2 = 6.0;
		double s2 = Math.PI * r2 * r2;
		// System.out.println(s2);

		if (s2 > s1) {
			System.out.println("площадь круга 1 меньше");
		} else if (s2 < s1) {
			System.out.println("площадь круга 2 меньше");
		} else {
			System.out.println("площади кругов равны");
		}
	}

}
