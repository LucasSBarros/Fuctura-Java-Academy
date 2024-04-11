package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Tarefa9 {

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
		
		numero.sort(Collections.reverseOrder());
		
		
		for (int i = 0; i < numero.size(); i++) {
			
			if (numero.get(i) % 2 == 0) {
				numero.remove(i);			}
		}
		
		numero.remove(3);
		numero.add(3, 30);
		
		System.out.println(numero);
		
	}

}