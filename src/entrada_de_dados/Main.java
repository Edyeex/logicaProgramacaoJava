package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		int y;
		double z;
		
		System.out.print("Digite um valor 'CHAR': ");
		x = sc.next().charAt(0);
		System.out.print("Digite um valor 'INT': ");
		y = sc.nextInt();
		System.out.print("Digite um valor 'DOUBLE': ");
		z = sc.nextDouble();
		
		
		System.out.println("Valor CHAR digitado: " + x);
		System.out.println("Valor INT digitado: " + y);
		System.out.printf(Locale.US, "Valor DOUBLE digitado: " + z);
		
	
		sc.close();
		
		
		/*
		 * int x;
		x = sc.nextInt();
		
		String x;
		x = sc.next();
		
		x = sc.nextDouble();
		System.out.printf(Locale.US, "Valor digitado: " + x);
		*/
	}
}
