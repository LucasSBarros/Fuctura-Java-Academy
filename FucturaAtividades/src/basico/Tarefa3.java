package basico;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
					
		System.out.println("Digite a distância percorrida por um carro (em km): ");
		double distanciaEmKilometros = sc.nextDouble();
		
		System.out.println("Digite o tempo gasto (em horas): ");
		double tempoEmHoras = sc.nextDouble();
		sc.close();
		
		double distanciaEmMetros = distanciaEmKilometros * 1000;
		double tempoEmSegundos = tempoEmHoras * 3600;
		double velocidadeMedia = distanciaEmMetros/tempoEmSegundos;
		
		System.out.println("A velocidade média do carro é: " + String.format("%.2f", velocidadeMedia) + (" m/s"));		
	}
}