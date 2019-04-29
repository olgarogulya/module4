package by.epam.training.module3;

import java.math.*;

public class Lesson3_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_10
		// составить программу нахождения произведения квадратов первых двухсот чисел
		
		long mult = 1;

		for (int i = 1; i <= 12; i++) {
			mult = mult * (i * i);
			 System.out.println("mult" + i + " " + mult);
		}
		System.out.println("mult " + mult);
		 
		/*BigInteger mult, b;
		int a = 1;
		//int b;
		b = new BigInteger("1");
		mult = new BigInteger("1");
		

		for (int i = 1; i <= 5; i++) {
			b = new BigInteger(i * i);
			mult = mult.multiply(b);
			System.out.println("mult " + mult);
			//a = a + 1;
			//mult = mult * i * i;
			// System.out.println("mult " + mult);
		}
		System.out.println("mult " + mult);
		*/
	}

}
