package basico2;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º Número: ");
		int numero1 = sc.nextInt();

		System.out.println("Digite o 2º Número: ");
		int numero2 = sc.nextInt();

		sc.nextLine();

		System.out.println("Digite o operador aritmético: ");
		String operadorAritmetico = sc.nextLine();

		sc.close();

		if(operadorAritmetico.equals("+")) {
			System.out.println("O resultado da soma é: " + (numero1+numero2));

		} else if(operadorAritmetico.equals("-")) {
			System.out.println("O resultado da subtração é: " + (numero1-numero2));

		} else if(operadorAritmetico.equals("*")) {
			System.out.println("O resultado da multiplicaão é: " + (numero1*numero2));	

		} else if(operadorAritmetico.equals("/")) {				

			if(numero2!=0) {
				System.out.println("O resultado da divisão é: " + (numero1/numero2));	
			} else {
				throw new ArithmeticException("Divisão por zero não é permitida.");
			}
		} else {
			System.out.println("Operador aritmético inválido!");
		}
	}
}
