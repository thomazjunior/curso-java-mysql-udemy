package exercicio_section4_estruturasequencial;

import java.util.Scanner;

public class ExercicioEntradaDeDados {

	public static void main(String[] args) {
		// Scanner = classe para leitura de dados 
		Scanner sc = new Scanner(System.in);
		/// NextLine = le a entrada de dados ate a primeira quebra de linha
		String s1 = sc.nextLine();
		System.out.print("Dados digitados: ");
		System.out.println(s1);
	}

}
