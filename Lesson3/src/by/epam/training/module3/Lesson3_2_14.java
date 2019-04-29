package by.epam.training.module3;

public class Lesson3_2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_14
		// Дано натуральное число n. Вычислить 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
		
		double sum = 1;
		double n = 5;

		for (double i = 1.0; i <= n; i++) {
			sum = sum + 1 / i;
			 System.out.println("sum " + sum);
		}
		System.out.println("sum " + sum);
	}

}
