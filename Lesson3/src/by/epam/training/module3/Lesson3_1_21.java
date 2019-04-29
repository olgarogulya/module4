package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 21
		// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		// девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
		// текст «Мне нравятся девочки!» или «Мне нравятся мальчики!»

		System.out.println("Kto ti: malchik ili devochka?");

		System.out.println("Enter D or M");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		// String b = "D";
		// String c = "M";
		// System.out.println("a = b: " + a.equals(b));
		// System.out.println("a = c: " + a.equals(c));

		if (a.equals("D")) {
			System.out.println("Mne nravyatsya malchiki");
		}
		if (a.equals("M")) {
			System.out.println("Mne nravyatsya devochki");
		}

	}

}
