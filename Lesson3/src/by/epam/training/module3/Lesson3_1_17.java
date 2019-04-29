package by.epam.training.module3;

public class Lesson3_1_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 17
		// Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и
		// тем же числом, равным большему из исходных, а если равны, то заменить числа
		// нулями

		int m, n;
		m = 6;
		n = 6;

		if (m != n) {
			int k = Math.max(m, n);
			m = k;
			n = k;
			System.out.println("m=" + m);
			System.out.println("n=" + n);
		} else {
			m = 0;
			n = 0;
			System.out.println("m=" + m);
			System.out.println("n=" + n);
		}
	}

}
