package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 9
		// Составить программу, которая определит по трем введенным сторонам, является
		// ли данный треугольник равносторонним

		System.out.println("Enter a");
		Scanner sa = new Scanner(System.in);
		int a = sa.nextInt();

		System.out.println("Enter b");
		Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();

		System.out.println("Enter c");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println("треугольник равносторонний");
		} else {
			System.out.println("треугольник не равносторонний");
		}
	}

}
