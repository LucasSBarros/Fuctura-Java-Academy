package listas;

import java.util.ArrayList;
import java.util.List;

public class Tarefa2 {

	public static void main(String[] args) {

		List<Integer> numero = new ArrayList<>();
		
		for (int i = 1; i<= 10; i++) {
			numero.add(i);
		}
		
		numero.add(11);
		System.out.println("Lista de números: " + numero);
		
	}

}