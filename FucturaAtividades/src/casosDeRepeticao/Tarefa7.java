package casosDeRepeticao;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();

		System.out.print("Contagem: ");

		for (int i = 0; i<=numero; i++) {
			System.out.print(i + ", ");	
		}	
		System.out.print("FIM!");
	}
}
