package by.epam.training.module3;

public class Lesson3_2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_03
		// Необходимо вывести на экран таблицу умножения на 3

		int a = 0;
		int b = 3;

		while (a < 10) {
			a = a + 1;
			int c = a * b;
			System.out.println(b + "*" + a + "=" + c);
		}
	}

}
