package basico2;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro equivalente ao mês do ano: ");
		
		int mes = sc.nextInt();
		sc.close();
		
		if (mes>=1 && mes <=12) {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.println("O Mês " + mes + " possui 31 dias!");
			} else if (mes == 2) {
				System.out.println("O Mês " + mes + " possui 28 dias!");
			} else {
				System.out.println("O Mês " + mes + " possui 30 dias!");
			}				
		} else {
			System.out.println("O Mês informado não existe!");
		}	
	}
}