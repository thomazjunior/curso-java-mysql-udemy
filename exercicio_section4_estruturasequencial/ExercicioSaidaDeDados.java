package exercicio_section4_estruturasequencial;

public class ExercicioSaidaDeDados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.print("Products: ");
		System.out.printf("%n%s, which price is $ %.2f", product1, price1);
		System.out.printf("%n%s, which price is $ %.2f", product2, price2);

		System.out.printf("%nMeasure with eight decimal places: %.8f", measure);

		System.out.printf("%nRouded (three decimal places): %.3f%n", measure);

	}
}