package casosDeRepeticao;

import java.util.ArrayList;
import java.util.List;

public class Tarefa10 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("azinho");
		nomes.add("bezinho");
		nomes.add("cezinho");
		nomes.add("dezinho");
		nomes.add("ezinho");
		nomes.add("efezinho");
		nomes.add("gezinho");

		System.out.println("Lista: " + nomes);

		nomes.remove(4);

		System.out.println("Lista: " + nomes);

		System.out.println("Posição 3: " + nomes.get(3));

		nomes.add("agazinho");
		nomes.add("izinho");
		nomes.add("jotinho");

		System.out.println("Lista: " + nomes);		

	}

}
