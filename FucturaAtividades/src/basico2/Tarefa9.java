package basico2;

import java.util.Scanner;

public class Tarefa9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Celsius: ");
		double Celsius = sc.nextDouble();

		System.out.println("Digite 1 - Para converter em Fahrenheit, 2 - Para converter em Kelvin");
		int digito = sc.nextInt();

		sc.close();
		
		if (digito == 1) {
			System.out.println("A temperatura em Fahrenheit é: " + String.format("%.2f", ((Celsius*9/5)+32)) + "º");
		} else if (digito == 2) {
			System.out.println("A temperatura em Kelvin é: " + String.format("%.2f", (Celsius + 273.15)) + "º");			
		} else {
			System.out.println("Dígito inválido!");
		}	
	}
}
