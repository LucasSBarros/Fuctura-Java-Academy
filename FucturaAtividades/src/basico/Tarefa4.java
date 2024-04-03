package basico;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite o valor em (R$) das hora de trabalho: ");
		double valorHoraTrabalhada = sc.nextDouble();
		sc.close();
		
		double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.println("O valor total do salário bruto foi R$" + String.format("%.2f", salarioBruto));		
	}
}