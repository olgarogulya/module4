package by.epam.training.module3;

public class Lesson3_2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3_2_17
		//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		
		long mult = 1;
		int a = 3;
		int n = 10;

		for (int i = 1; i < n; i++) {
			mult = mult * (a + i);
			// System.out.println("sum" + i + "=" + sum);
			
		//	System.out.println("mult " + i + "=" + mult);
		}
		System.out.println("mult " + mult);
	}

}
