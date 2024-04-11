package casosDeRepeticao;

import java.util.Random;

public class Tarefa6 {

	public static void main(String[] args) {

		Random random = new Random();
		int numero = 0, j = 0, k = 0;

		System.out.println("Numeros Sorteados: ");

		for (int i = 0; i<20; i++) {

			numero = random.nextInt(10);

			System.out.print(numero + " ");

			if (numero > 5) {
				j++;
			}

			if (numero % 3 == 0) {
				k++;
			}

		}

		System.out.println("\nQuantidade de Números acima de 5: " + j);
		System.out.println("Quantidade de Números divisíveis por 3: " + k);

	}

}
