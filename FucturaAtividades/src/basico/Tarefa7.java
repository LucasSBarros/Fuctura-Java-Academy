package basico;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {

		double fretePorQuilo = 5.00;

		Scanner sc = new Scanner(System.in);	

		System.out.println("Digite o peso em Kg da encomenda: ");
		double peso = sc.nextDouble();
		sc.close();

		double frete = peso * fretePorQuilo;

		System.out.println("O valor do frete do produto é: R$" + String.format("%.2f", frete));

	}
}