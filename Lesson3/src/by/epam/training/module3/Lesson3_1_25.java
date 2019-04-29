package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 25
		// Написать программу — модель анализа пожарного датчика в помещении, которая
		// выводит сообщение «Пожароопасная ситуация », если температура в комнате
		// превысила 60° С

		System.out.println("Enter temperature");
		Scanner sa = new Scanner(System.in);
		int n = sa.nextInt();

		if (n >= 60.0) {
			System.out.println("Pozharoopasnaya situaciya");
		}
	}

}
