package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3
		// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
		// слово «yes», если число а меньше 3; если больше, то вывести слово «no».

		System.out.println("Enter a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a < 2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}