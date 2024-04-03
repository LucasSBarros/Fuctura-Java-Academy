package basico2;

import java.util.Scanner;

public class Tarefa10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do salário do funcionário: ");
		double salario = sc.nextDouble();	
		
		sc.close();
		
		if(salario <= 1500.00) {
			System.out.println("O valor do salário após o aumento é de: " + String.format("%.2f", (salario*1.15)));
		} else if (salario > 1500.00 && salario <=2500.00) {
			System.out.println("O valor do salário após o aumento é de: " + String.format("%.2f", (salario*1.10)));	
		} else if (salario > 2500.00) {		
			System.out.println("O valor do salário após o aumento é de: " + String.format("%.2f", (salario*1.05)));		
		}
	}
}