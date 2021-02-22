package vetores.teste;

import vetores.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);

		try {
			vetor.adcionaSenior("elemento 1");
			
			vetor.adcionaSenior("elemento 2");

			vetor.adcionaSenior("elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
