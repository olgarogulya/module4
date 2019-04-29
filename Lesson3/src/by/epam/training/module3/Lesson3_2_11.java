package by.epam.training.module3;

public class Lesson3_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_11
		// составить программу нахождения разности кубов первых двухсот чисел
		
		int sum = 0;

		for (int i = 1; i <= 200; i++) {
			sum = sum - i * i * i;
			// System.out.println("sum " + sum);
		}
		System.out.println("sum " + sum);
	}

}
