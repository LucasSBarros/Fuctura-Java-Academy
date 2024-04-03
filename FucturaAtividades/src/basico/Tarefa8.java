package basico;

import java.util.Scanner;

public class Tarefa8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
	
		System.out.println("Digite a cotação do Dolar($) em relação ao Real(R$): ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite um valor em Reais()R$: ");
		double valorReais = sc.nextDouble();
		
		sc.close();

		double valorConvertidoEmDolares = cotacaoDolar * valorReais;
		
		System.out.println("O valor convertido em Reais é: R$" + String.format("%.2f", valorConvertidoEmDolares));

	}
}
