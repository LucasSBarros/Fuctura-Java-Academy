package basico2;

import java.util.Scanner;

public class Tarefa15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora atual: ");
		int hora = sc.nextInt();
		
		sc.close();
		
		if (hora >= 5 && hora <12 ) {
			System.out.println("Bom dia");
		} else if (hora >= 12 && hora <18) {
			System.out.println("Boa tarde");
		} else if ((hora >= 18 && hora <23) || (hora >= 0 && hora <5)) {
			System.out.println("Boa noite");
		}
	}
}