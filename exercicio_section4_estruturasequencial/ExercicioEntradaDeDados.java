package exercicio_section4_estruturasequencial;

import java.util.Scanner;

public class ExercicioEntradaDeDados {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Selecione o exercício: ");
		System.out.println("1 - Somar dois valores digitados pelo usuário");
		System.out.println("2 - Ler o valor do raio e mostrar a area de um circulo com quatro casa decimais");
		System.out.println("3 - Ler quatro valores e retornar a diferenca dos produtos de A*B e C*D");
		System.out.println(
				"4 - Ler o numero de um funcionario, numero de horas trabalhadas, valor que recebe por hora e calcular o salario");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			exercicio1();
			break;
		case 2:
			exercicio2();
		case 3:
			exercicio3();
		case 4:
			exercicio4();

		default:
			break;
		}
	}

	public static void exercicio1() {
		// ler dois valores inteiros, e depois mostrar
		// na tela a soma desses numeros com uma mensagem explicativa
		System.out.println("Digite o valor 1: ");
		float valor1 = sc.nextFloat();
		System.out.println("Digite o valor 2: ");
		float valor2 = sc.nextFloat();
		System.out.printf("O resultado da soma de %.2f + %.2f: %.2f", valor1, valor2, valor1 + valor2);
	}

	public static void exercicio2() {
		// ler o valor do raio e retornar a area de um circulo
		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();

		float area = (float) (3.14159 * (Math.pow(raio, 2)));
		System.out.printf("A=%.4f", area);
	}

	public static void exercicio3() {
		// recebe quatro valores e calcula a diferenca do produto do primeiro e segundo
		// pelo terceiro e quarto
		double num1, num2, num3, num4;
		System.out.println("Digite o valor 1: ");
		num1 = sc.nextInt();
		System.out.println("Digite o valor 2: ");
		num2 = sc.nextInt();
		System.out.println("Digite o valor 3: ");
		num3 = sc.nextInt();
		System.out.println("Digite o valor 4: ");
		num4 = sc.nextInt();
		double resultado = (num1 * num2) - (num3 * num4);

		System.out.printf("A diferenca entre %d * %d e %d * %d é: %d", num1, num2, num3, num4, resultado);

	}

	public static void exercicio4() {
		System.out.println("Digite o numero do funcionario: ");
		int numFunc = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		double numHoras = sc.nextDouble();
		System.out.println("Digite o valor por hora: ");
		double valHor = sc.nextDouble();
		float valSal = (float) (numHoras * valHor);
		System.out.println("NUMBER: " + numFunc);
		System.out.println(valSal);
		System.out.printf("SALARY = U$ %f", valSal);
	}

}
