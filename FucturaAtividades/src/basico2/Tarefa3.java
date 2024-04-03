package basico2;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a 1ª nota do aluno: ");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a 2ª nota do aluno: ");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a 3ª nota do aluno: ");
		double nota3 = sc.nextDouble();

		sc.close();

		Double media = (nota1 + nota2 + nota3)/3;

		if (media >= 7) {
			System.out.println("A média do aluno foi: " + media + "O aluno está APROVADO!");
		} else if (media <= 4) {
			System.out.println("A média do aluno foi: " + media + "O aluno está REPROVADO!");
		} else {
			System.out.println("A média do aluno foi: " + media + "O aluno precisará fazer uma PROVA FINAL!");
		}

	}

}
