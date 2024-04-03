package basico;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Digite o seu nome de usuário: ");
		String resposta = sc.nextLine();
		sc.close();
		
		System.out.println("Olá, " + resposta + "! Bem-vindo ao nosso programa!");		
	}
}