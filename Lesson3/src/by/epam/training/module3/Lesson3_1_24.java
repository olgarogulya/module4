package by.epam.training.module3;

public class Lesson3_1_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 24
		// Составить программу, определяющую результат гадания на ромашке — «любит—не
		// любит», взяв за исходное данное количество лепестков n

		int n = 25;
		int i = 1;

		while (i < n) {
			if (i % 2 == 0) {
				System.out.println("lyubit");
			} else {
				System.out.println("ne lyubit");
			}
			i = i + 1;
		}
	}

}
