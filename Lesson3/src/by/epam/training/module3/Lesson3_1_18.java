package by.epam.training.module3;

public class Lesson3_1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 18
		// Подсчитать количество отрицательных среди чисел а, b, с

		int a, b, c;
		a = 5;
		b = 6;
		c = 9;

		int i = 0;

		if (a < 0) {
			i = i + 1;
		}
		if (b < 0) {
			i = i + 1;
		}
		if (c < 0) {
			i = i + 1;
		}
		System.out.println(i);
	}

}
