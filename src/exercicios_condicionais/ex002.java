package exercicios_condicionais;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero = sc.nextInt();
		int segundoNumero = sc.nextInt();
		int terceiroNumero = sc.nextInt();
		
		if(primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
			System.out.println("MENOR NUMERO: " + primeiroNumero);
		}else if(segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
			System.out.println("MENOR NUMERO: " + segundoNumero);
		}else if(terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
			System.out.println("MENOR NUMERO: " + terceiroNumero);
		}else {
			System.out.println("NUMEROS IGUAIS!!! ");
		}
		
		sc.close();
	}

}
