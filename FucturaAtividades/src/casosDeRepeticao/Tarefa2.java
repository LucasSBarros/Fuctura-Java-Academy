package casosDeRepeticao;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int verificadorParada = 1;
		double soma = 0.0;
		int idade = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			soma += idade;
			i++;

			if (idade >= 21) {
				j++;
			}

			System.out.println("Digite 1 para continuar digitar dados ou 0 para parar: ");
			verificadorParada = sc.nextInt();

			if (verificadorParada == 0) {
				System.out.println("A quantidade de idades digitadas foi: " + i);
				System.out.println("A media entre as idades digitadas é: " + (soma/i));
				System.out.println("A quantidade de pessoas com 21 anos ou mais foi: " + j);

			}

		}while(verificadorParada == 1);
	}

}
