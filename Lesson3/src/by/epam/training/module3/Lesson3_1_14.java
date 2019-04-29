package by.epam.training.module3;

public class Lesson3_1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 14
		// Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным

		double a; // angle 1
		double b; // angle 2

		a = 60.0;
		b = 30.0;
		double c = a + b;

		if (c < 180.0) {
			System.out.println("triangle exists");
			if (a == 90 || b == 90 || (180 - c) == 90) {
				System.out.println("right triangle");
			}
		} else {
			System.out.println("triangle does not exist");
		}

	}

}
