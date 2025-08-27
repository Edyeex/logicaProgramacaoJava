package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner md = new Scanner(System.in);
		
		double base, altura;
		
		base = md.nextDouble();
		altura = md.nextDouble();
		
		double area = base * altura;
		double perimetro = 2.0 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.printf("Area = %.4f\n", area);
		System.out.printf("Perimetro = %.4f\n", perimetro);
		System.out.printf("Diagonal = %.4f\n", diagonal);

		md.close();
	}

}
