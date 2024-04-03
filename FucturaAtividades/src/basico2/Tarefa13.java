package basico2;

import java.util.Scanner;

public class Tarefa13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();	
		
		sc.close();
		
		int contador = 0;
		
		for (int i = 1; i <= Math.sqrt(numero); i++) {
			
			if(numero % i == 0) {
				contador++;
			}
			
		}
		
		if (contador < 2) {
			System.out.println("O número " + numero + " é primo!");
		} else {
			System.out.println("O número " + numero + " não é primo!");
		}
	}
}
