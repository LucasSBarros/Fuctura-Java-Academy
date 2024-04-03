package basico2;

import java.util.Scanner;

public class Tarefa11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o peso em KG: ");
		double peso = sc.nextDouble();

		System.out.println("Digite a altura em M: ");
		double altura = sc.nextDouble();

		sc.close();

		double imc = peso / (altura*altura);

		if (imc < 18.5) {
			System.out.println("IMC: " + String.format("%.1f",imc) + " Abaixo do peso");
		} else if (imc >= 18.5 && imc<=24.9) {
			System.out.println("IMC: " + String.format("%.1f",imc) + " Peso normal ");
		} else if (imc >= 25 && imc<=29.9) {
			System.out.println("IMC: " + String.format("%.1f",imc) + " Sobrepeso");
		} else if (imc >= 30 && imc<=34.9) {
			System.out.println("IMC: " + String.format("%.1f",imc) + " Obesidade grau I");
		} else if (imc >= 35 && imc<=39.9) {
			System.out.println("IMC: " + String.format("%.1f",imc) + " Obesidade grau II");
		} else {
			System.out.println("IMC: " + String.format("%.1f",imc) + " Obesidade grau III");
		}
	}
}
