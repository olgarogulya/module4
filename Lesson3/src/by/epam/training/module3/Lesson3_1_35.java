package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_1_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 35
		// Вычислить число и месяц в невисокосном году по номеру дня

		System.out.println("Введите номер дня от 1 до 365");
		Scanner sa = new Scanner(System.in);
		int d = sa.nextInt();
		int с;

		// jan-31 [1-31], feb-28 [32-59], mar-31 [60-90]
		// apr-30 [91-120], may-28 [121-151], jun-30 [152-181]
		// jul-31 [182-212], aug-31 [213-243], sept-30 [244-273]
		// oct-31 [274-304], nov-30 [305-334], dec-31 [335-365]

		if (d > 0 && d <= 31) {
			System.out.println(d + " января");
		}
		if (d > 31 && d <= 59) {
			с = d - 31;
			System.out.println(с + " февраля");
		}
		if (d > 59 && d <= 90) {
			с = d - 59;
			System.out.println(с + " марта");
		}
		if (d > 90 && d <= 120) {
			с = d - 90;
			System.out.println(с + " апреля");
		}
		if (d > 120 && d <= 151) {
			с = d - 120;
			System.out.println(с + " мая");
		}
		if (d > 151 && d <= 181) {
			с = d - 151;
			System.out.println(с + " июня");
		}
		if (d > 181 && d <= 212) {
			с = d - 181;
			System.out.println(с + " июля");
		}

		if (d > 212 && d <= 243) {
			с = d - 212;
			System.out.println(с + " августа");
		}
		if (d > 243 && d <= 273) {
			с = d - 243;
			System.out.println(с + " сентября");
		}
		if (d > 273 && d <= 304) {
			с = d - 273;
			System.out.println(с + " октября");
		}
		if (d > 304 && d <= 334) {
			с = d - 304;
			System.out.println(с + " ноября");
		}
		if (d > 334 && d <= 365) {
			с = d - 334;
			System.out.println(с + " декабря");
		}
		else {
			System.out.println("неверно введен номер");
		}
	}
}
