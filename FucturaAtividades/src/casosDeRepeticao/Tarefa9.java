package casosDeRepeticao;

import java.util.Scanner;

public class Tarefa9 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 0;
		int maior = 0;
		int aux = 0;
	
		double somatorio = 0.0;
		int valor = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
			somatorio += valor;
			i++;

			if (valor < 5) {
				j++;
			}
			
			if (valor > 18) {
				k++;
			}

			if (valor > aux) {
				aux = valor;
				maior = aux;				
			}	

			if (i == 10) {
				System.out.println("A media de idade do grupo: " + (somatorio/i));
				System.out.println("A quantidade de pessoas com menos de 5 anos: " + j);
				System.out.println("A quantidade de pessoas com mais de 18 anos: " + k);		
				System.out.println("A maior idade lida: " + maior);
			}

		}while(i <= 10);
	}

}
