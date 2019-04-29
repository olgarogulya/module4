package by.epam.training.module3;

public class Lesson3_1_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 16
		// На плоскости ХОY задана своими координатами точка А. Указать, где она
		// расположена (на какой оси или в каком координатном угле).

		double x, y; // A coordinates
		x = -5.0;
		y = 6.0;

		if (x > 0 && y > 0) {
			System.out.println("I quarter");
		}
		if (x < 0 && y > 0) {
			System.out.println("II quarter");
		}
		if (x < 0 && y < 0) {
			System.out.println("III quarter");
		}
		if (x > 0 && y < 0) {
			System.out.println("IV quarter");
		}
		if (y == 0) {
			System.out.println("X axis");
		}
		if (x == 0) {
			System.out.println("Y axis");
		}
	}

}
