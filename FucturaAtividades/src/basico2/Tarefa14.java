package basico2;

import java.util.Scanner;

public class Tarefa14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		sc.close();
		
		if (ano % 4 == 0) {
			if (ano % 100 == 0 && ano % 400 != 0) {
				System.out.println("O ano " + ano + " NÃO É Bissexto");
			}else {
				System.out.println("O ano " + ano + " È Bissexto");
			}
		}
	}
}
