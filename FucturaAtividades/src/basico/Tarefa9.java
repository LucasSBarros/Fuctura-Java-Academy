package basico;

import java.util.Scanner;

public class Tarefa9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura da parede em metros:");
		int alturaDaParede = sc.nextInt();
		
		System.out.println("Digite a largura da parede em metros:");
		int larguraDaParede = sc.nextInt();
		
		sc.close();
		
		int area = alturaDaParede * larguraDaParede;
		
		double quantidadeDeTinta = area/2;
		
		System.out.println("A quantidade de tinta necessária para pintar a parede é de: " + quantidadeDeTinta + " litros de tinta.");
		
	}

}
