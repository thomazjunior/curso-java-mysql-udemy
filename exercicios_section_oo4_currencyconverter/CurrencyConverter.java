package exercicios_section_oo4_currencyconverter;

import java.text.DecimalFormat;

public class CurrencyConverter {

	double amount, dollar, pound, code, euro, yen, ringgit, rupee;

	DecimalFormat f = new DecimalFormat("##.##");

	public void converter() {
		// For amounts Conversion
		if (code == 1) {

			dollar = amount / 70;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");

			pound = amount / 88;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

			euro = amount / 80;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");

			yen = amount / 0.63;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");

			ringgit = amount / 16;
			System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
		} else if (code == 2) {
			// For Dollar Conversion

			rupee = amount * 70;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");

			pound = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

			euro = amount * 0.87;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

			yen = amount * 111.087;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");

			ringgit = amount * 4.17;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
		} else if (code == 3) {
			// For Pound Conversion

			rupee = amount * 88;
			System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");

			dollar = amount * 1.26;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");

			euro = amount * 1.10;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");

			yen = amount * 140.93;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");

			ringgit = amount * 5.29;
			System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
		} else if (code == 4) {
			// For Euro Conversion

			rupee = amount * 80;
			System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");

			dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");

			pound = amount * 0.90;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");

			yen = amount * 127.32;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");

			ringgit = amount * 4.78;
			System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
		} else if (code == 5) {

			// For Yen Conversion

			rupee = amount * 0.63;
			System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");

			dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");

			pound = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");

			euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");

			ringgit = amount * 0.037;
			System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion

			rupee = amount * 16.8;
			System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");

			dollar = amount * 0.239;
			System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");

			pound = amount * 0.188;
			System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");

			euro = amount * 0.209;
			System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");

			yen = amount * 26.63;
			System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
		} else {
			System.out.println("Invalid input");
		}

	}
}
