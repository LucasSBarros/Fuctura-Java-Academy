package basico2;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o preço do produto: ");
		double valor = sc.nextDouble();

		System.out.println("Digite a forma de pagamento: 1 - à vista, 2 - no cartão de crédito, 3 no cartão de débito");
		int digito = sc.nextInt();

		sc.close();

		if (digito == 1 || digito == 3) {
			System.out.println("Valor final da compra é R$: " + String.format("%.2f", (valor*0.9)));
		} else if (digito == 2) {
			System.out.println("Valor final da compra é R$: " + String.format("%.2f", valor));			
		} else {
			System.out.println("Dígito inválido!");
		}	
	}
}