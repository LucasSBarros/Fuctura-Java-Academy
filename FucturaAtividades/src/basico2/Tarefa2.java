package basico2;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		if (numero1 > numero2) {
			System.out.println("O número: " + numero1 + " é maior que " + numero2 + ".");
		} else if (numero1 == numero2) {
			System.out.println("O número: " + numero1 + " é igual ao " + numero2 + ".");
		} else {
			System.out.println("O número: " + numero1 + " é menor que " + numero2 + ".");
		}
		
	}

}
