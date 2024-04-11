package casosDeRepeticao;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {


		int i = 0;
		int j = 0;
		int menor = 0;
		int verificadorParada = 1;
		double somatorio = 0.0;
		int valor = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);

		do {
			int aux = valor;

			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
			somatorio += valor;
			i++;

			if (valor % 2 == 0) {
				j++;
			}

			if (valor < aux) {
				menor = valor;
			}	

			System.out.println("Digite 1 para continuar digitar dados ou 0 para parar: ");
			verificadorParada = sc.nextInt();

			if (verificadorParada == 0) {
				System.out.println("A somatório entre os valores digitados é: " + somatorio);
				System.out.println("o menor valor digitado é: " + menor);
				System.out.println("A media entre os valores digitados é: " + (somatorio/i));
				System.out.println("A quantidade de valores pares é: " + j);

			}

		}while(verificadorParada == 1);
	}

}
