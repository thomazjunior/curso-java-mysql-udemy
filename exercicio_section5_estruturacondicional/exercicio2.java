package exercicio_section5_estruturacondicional;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt(); 
		if (num1%2==0) {
			System.out.println("Este numero é par");
		} else {
			System.out.println("Este numero é impar");
		}
			
		sc.close();
	}
}
