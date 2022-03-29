package exercicio_section5_estruturacondicional;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores inteiros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1%num2==0 || num2%num1==0) {
			System.out.println("Os numeros sao multiplos");
		}
		else {
			System.out.println("Os numeros nao sao multiplos");
		}
	}
}
