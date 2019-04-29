package by.epam.training.module3;

public class Lesson3_2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_16
		//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)	
		
		long mult = 1;
		int i = 0;
		int sum = 0;

		for (i = 1; i <= 10; i++) {
			sum = sum + i;
			// System.out.println("sum" + i + "=" + sum);
			mult = mult * sum;
			// System.out.println("mult " + i + "=" + mult);
		}
		System.out.println("mult " + mult);
		
	}
	

}
