package basico2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();

		sc.close();
		
		if(idade >= 18 && idade <=70) {
			
			System.out.println(nome + " você DEVE votar nas eleições, pois seu voto é OBRIGATÓRIO.");
			
		} else if((idade < 18 && idade >= 16) || idade > 70) {
			System.out.println(nome + " você PODE votar nas eleições, pois seu voto é FACULTATIVO.");
			
		} else {
			System.out.println(nome + " você NÃO PODE votar nas eleições!");
		}
	}
}