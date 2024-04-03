package basico;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
	
		System.out.println("Digite o preço do primeiro produto: ");
		double precoProduto1 = sc.nextDouble();

		System.out.println("Digite o preço do segundo produto: ");
		double precoProduto2 = sc.nextDouble();
		sc.close();
		
		double totalCompra = precoProduto1 + precoProduto2;
		
		System.out.println("O valor total da compra foi R$" + String.format("%.2f", totalCompra));		
	}
}