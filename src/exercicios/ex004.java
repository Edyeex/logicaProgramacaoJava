package exercicios;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da primeira pessoa: ");
		String nome1 = sc.next();
		System.out.println("Digite a dade da primeira pessoa: ");
		int idade1 = sc.nextInt();
		
		System.out.println("Digite o nome da segunda pessoa: ");
		String nome2 = sc.next();
		System.out.println("Digite a idade da segunda pessoa: ");
		int idade2 = sc.nextInt();
		
		double media = (double) (idade1 + idade2) / 2;
		
		System.out.printf("A idade média entre %s e %s é de %.1f", nome1, nome2, media);
		
		sc.close();
	}

}
