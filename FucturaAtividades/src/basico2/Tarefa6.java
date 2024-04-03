package basico2;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma letra: ");

		String letra = sc.nextLine();

		sc.close();

		if ("aeiouAEIOU".contains(letra)) {
			System.out.println("A letra " + letra + " é uma VOGAL");
		} else {
			System.out.println("A letra " + letra + " é uma CONSOANTE");
		}

	}

}
