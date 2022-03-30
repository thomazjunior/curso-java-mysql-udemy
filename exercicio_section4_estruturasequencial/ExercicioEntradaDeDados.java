package exercicio_section4_estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntradaDeDados {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Selecione o exercício: ");
		System.out.println("1 - Somar dois valores digitados pelo usuário");
		System.out.println("2 - Ler o valor do raio e mostrar a area de um circulo com quatro casa decimais");
		System.out.println("3 - Ler quatro valores e retornar a diferenca dos produtos de A*B e C*D");
		System.out.println("4 - Ler o numero de um funcionario, numero de horas trabalhadas, valor que recebe por hora e calcular o salario");
		System.out.println("5 - Ler o codigo da peca 1 e 2, quantidades e valores e retornar o resultado");
		System.out.println("6 - Ler 3 valores e calcular a área de um triangulo");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			exercicio1();
			break;
		case 2:
			exercicio2();
			break;
		case 3:
			exercicio3();
			break;
		case 4:
			exercicio4();
			break;
		case 5:
			exercicio5();
			break;
		case 6: 
			exercicio6();
			break;

		default:
			break;
		}
	}

	public static void exercicio1() {
		// ler dois valores inteiros, e depois mostrar
		// na tela a soma desses numeros com uma mensagem explicativa
		System.out.println("Digite o valor 1: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o valor 2: ");
		float valor2 = sc.nextFloat();
		System.out.printf("O resultado da soma de %d + %.2f: %.2f", valor1, valor2, valor1 + valor2);
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
		int num1, num2, num3, num4;
		System.out.println("Digite o valor 1: ");
		num1 = sc.nextInt();
		System.out.println("Digite o valor 2: ");
		num2 = sc.nextInt();
		System.out.println("Digite o valor 3: ");
		num3 = sc.nextInt();
		System.out.println("Digite o valor 4: ");
		num4 = sc.nextInt();
		int resultado = (num1 * num2) - (num3 * num4);

		System.out.printf("Aaa diferenca entre %d * %d e %d * %d é: %d", num1, num2, num3, num4, resultado);

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
	
	public static void exercicio5() {
		System.out.println("Digite o codigo da peça 1: ");
		int codPeca1 = sc.nextInt();
		System.out.println("Digite o número de peças: ");
		double qtdPeca1 = sc.nextDouble();
		System.out.println("Digite o valor da peca: ");
		double valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o codigo da peça 2: ");
		int codPeca2 = sc.nextInt();
		System.out.println("Digite o número de peças: ");
		double qtdPeca2 = sc.nextDouble();
		System.out.println("Digite o valor da peca: ");
		double valorPeca2 = sc.nextDouble();
		
		double resultado = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		
		System.out.format("VALOR PAGAR: R$ %f", resultado);
		
	}

	public static void exercicio6 () {
		Locale.setDefault(Locale.US);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		
	}

}
