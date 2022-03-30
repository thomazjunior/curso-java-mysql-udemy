package exercicios_section_oo4_currencyconverter;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		CurrencyConverter cv = new CurrencyConverter();
		Scanner sc = new Scanner(System.in);
		System.out.println("hi, Welcome to the Currency Converter!");

		System.out.println("which currency You want to Convert ? ");

		System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		cv.code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		cv.amount = sc.nextFloat();
		cv.converter();
		
		System.out.println("Thank you for choosing our Example Programs");
	}
}
