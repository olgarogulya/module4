package by.epam.training.module3;

import java.util.Scanner;

public class Lesson3_2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3_2_24
		//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
		//Преобразовать его в другое число, цифры которого будут сделовать в обратном порядке по сравнению с введенным числом.
		
		
		System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        // int a = 24652;
        long sum = 0; //четные
        double sum2 = 0; //нечетные
        int i = 0;
       
        while (a > 0) {
           
        	long d = a % 10;
           System.out.println("d=" + d);
            a = a / 10;
          // System.out.println("a=" + a);
          // System.out.println("d0=" + d % 2);
            
            
        //  System.out.println("i=" + i);
            sum2 = (sum2 + d * Math.pow(10, -i));
          //  System.out.println("sum2 =" + sum2);
            i = i + 1;
            
            
            if (d % 2 == 0) {
                sum = sum + d;
           //     System.out.println("d1=" + d % 2);
           //     System.out.println("sum=" + sum);
            }
            
        }
        
       long sum3 = (long) (sum2 * Math.pow(10, i-1));
        System.out.println("Число наоборот " + sum3);
        System.out.println("Сумма четных цифр " + sum);
	}
}