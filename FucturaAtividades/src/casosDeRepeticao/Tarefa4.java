package casosDeRepeticao;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int i = 0;
		double somatorio = 0.0;
		
		while (idade!= 999) {
			
			System.out.println("Digite a idade de um aluno: ");
			System.out.println("Informe 999 para parar.");
			
			somatorio += idade;
			i++;
			idade = sc.nextInt();
			
		}
		
		System.out.println("A quantidade de pessoas na turma é: " + (i-1));
		System.out.println("A média de idade no grupo é: " + somatorio/(i-1));
		
		
	}

}
