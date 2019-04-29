package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4
		// Составить программу: равны ли два числа а и b

		System.out.println("Enter a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter b");
		Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();
		if (a == b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}