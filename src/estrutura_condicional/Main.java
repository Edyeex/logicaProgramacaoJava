package estrutura_condicional;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner hora = new Scanner(System.in);
		
		System.out.println("Que horas são? ");
		int horario = hora.nextInt();
		
		if( horario <= 12) {
			System.out.println("Bom dia!!!!");
		} else if(horario <= 18){
			System.out.println("Boa tarde!!!!");
		} else {
			System.out.println("Boa noite!!!!");
		}
		
		hora.close();
	}
}
