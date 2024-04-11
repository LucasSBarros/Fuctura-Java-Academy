package listas;

import java.util.ArrayList;
import java.util.List;

public class Tarefa4 {

	public static void main(String[] args) {

		List<Integer> numero = new ArrayList<>();
		List<Integer> numero2 = new ArrayList<>();
		
		for (int i = 1; i<= 10; i++) {
			numero.add(i);
		}
				
		numero.add(11);
		
		numero.remove(5);
		
		for (int i = 12; i<= 20; i++) {
			numero2.add(i);
		}
		
		numero.addAll(numero2);
		
		System.out.println("Lista de números: " + numero);
		
	}

}