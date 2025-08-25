package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex002{
	public static void main(String[] args) {
		double largura, comprimento, valorMetroQuadrado;
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Qual a largura do terreno? ");
		largura = leitura.nextDouble();
		System.out.println("Qual o comprimento do terreno? ");
		comprimento = leitura.nextDouble();
		System.out.println("Qual o valor do metro quadrado do terreno? ");
		valorMetroQuadrado = leitura.nextDouble();
		
		
		double areaTerreno = largura * comprimento;
		double precoTerreno = areaTerreno * valorMetroQuadrado;
		
		System.out.printf(Locale.US, "A largura do terreno é: %.1f\n", largura);
		System.out.printf(Locale.US, "O comprimento do terreno é: %.2f\n", comprimento);
		System.out.printf(Locale.US, "A area total do terreno é de: %.2f metros quadrados\n", areaTerreno);
		System.out.printf(Locale.US, "O preço do metro quadrado do terreno é: R$%.2f\n", valorMetroQuadrado);
		System.out.printf(Locale.US, "O preço total do terreno é: R$%.2f", precoTerreno);
		
		
		leitura.close();
	}
}