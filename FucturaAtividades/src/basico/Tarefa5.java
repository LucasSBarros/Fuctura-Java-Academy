package basico;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do empréstimo adquirido: ");
		double emprestimo = sc.nextDouble();

		System.out.println("Digite a taxa de juros mensais: ");
		double taxaJurosMensal = sc.nextDouble()/100;
		
		System.out.println("Digite a quantidade de meses: ");
		int qntMeses = sc.nextInt();
		sc.close();
		
		double jurosSimples = emprestimo * taxaJurosMensal * qntMeses;

		double parcelaMensal = (emprestimo + jurosSimples)/ qntMeses;
		
		System.out.println("O valor da parcela mensal será de R$" + String.format("%.2f", parcelaMensal));		
	}
}