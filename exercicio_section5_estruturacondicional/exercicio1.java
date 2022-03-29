package exercicio_section5_estruturacondicional;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();
		if (num1 < 0) {
			System.out.println("Este numero é negativo");
		}
		else if (num1>0) {
			System.out.println("Este numero é positivo");
		} 
		else {
			System.out.println("Este numero é nulo");
		}
	}

}
