package casosDeRepeticao;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		
		int idade = 0, somatorio = 0, maiorIdade = 0, maior18 = 0, menor5 = 0;
		double media = 0;
		

		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			
			idade = sc.nextInt();
			
			somatorio += idade;
			
			if (idade > 18) {
				
				maior18++;
				
			} else if (idade < 5) {
				
				menor5++;
				
			}
			
			if (idade > maiorIdade) {
				
				maiorIdade = idade;
				
			}
			
		}
		
		media = somatorio/10;
		
		System.out.println("A média de idade do grupo é: " + media);
		System.out.println("A quantidade de pessoas que tem mais de 18 é: " + maior18);
		System.out.println("A quantidade de pessoas que tem menos de 5 é: " + menor5);
		System.out.println("A maior idade lida foi: " + maiorIdade);
		
	}

}
