package exercicios_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRIMEIRA NOTA DO ALUNO: ");
		double nota1 = sc.nextDouble();
		System.out.println("SEGUNDA NOTA DO ALUNO: ");
		double nota2 = sc.nextDouble();
		
		double somaNotas = nota1 + nota2;
		
		if(somaNotas < 60.00) {
			System.out.printf("NOTA: %.1f\n", somaNotas);
			System.out.println("ALUNO REPROVADO");
		}else {
			System.out.printf("NOTA: %.1f\n", somaNotas);
			System.out.println("ALUNO APROVADO");
		}

		sc.close();
	}

}
