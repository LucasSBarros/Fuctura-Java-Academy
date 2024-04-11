package casosDeRepeticao;

public class Tarefa1 {

	public static void main(String[] args) {
		int i = 0;
		do {
			if(i == 0 || i%3==0) {
				System.out.println(i);
			}

			if (i == 30) {
				System.out.println("Acabou!");
			}
			i++;
		}while(i<=30);
	}
}
