package basico;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {

		double precoPorLitro = 0.02;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de litros de água consumidos pela residência no mês: ");
		double litros = sc.nextInt();
		sc.close();

		double valorConta = litros*precoPorLitro;

		System.out.println("O valor da conta de água foi de R$" + String.format("%.2f", valorConta));
	}
}
