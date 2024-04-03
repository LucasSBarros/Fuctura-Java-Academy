package basico;

import java.util.Scanner;

public class Tarefa10 {

	public static void main(String[] args) {
		
		double juros = 0.02;
		double parcela = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o preço do produto à vista: ");
		double precoProduto = sc.nextDouble();
		
		System.out.println("Informe o número de parcelas: ");
		int numeroDeParcelas = sc.nextInt();
				
		sc.close();
				
		for(int i = 1; i <= numeroDeParcelas; i++) {
			
			parcela = (precoProduto + (precoProduto * juros))/numeroDeParcelas;
			System.out.println("O valor da " + i + "ª parcela é: " + parcela);
		}
	
	}
}