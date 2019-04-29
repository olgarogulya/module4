package by.epam.training.module3;

public class Lesson3_2_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_05
		// С помощью оператора while напишите программу определения суммы всех нечетных
		// чисел в диапазоне от 1 до 99 включительно

		int a = 1;
		int c = 0;

		while (a <= 99) {
			// System.out.println("a=" + a);
			c = c + a;
			a = a + 2;

			// System.out.println(c);
		}
		System.out.println(c);
	}

}
