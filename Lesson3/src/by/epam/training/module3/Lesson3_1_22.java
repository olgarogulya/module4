package by.epam.training.module3;

public class Lesson3_1_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 22
		// Перераспределить значения переменных х и у так, чтобы в х оказалось большее
		// из этих значений, а в y - меньшее

		int x, y;
		x = 84;
		y = 84;

		int a = Math.max(x, y);
		int b = Math.min(x, y);

		// System.out.println("a=" + a);
		// System.out.println("b=" + b);

		x = a;
		y = b;

		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
