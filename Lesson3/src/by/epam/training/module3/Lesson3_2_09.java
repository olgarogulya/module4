package by.epam.training.module3;

public class Lesson3_2_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_09
		// Найти сумму произведений первых ста чисел

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum = sum + i * i;
			// System.out.println("sum " + sum);
		}
		System.out.println("sum " + sum);
	}

}
