package vetores.teste;

import vetores.Vetor;

public class Aula04 {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adcionaEspecialista("elemento 1");

		vetor.adcionaEspecialista("elemento 2");

		vetor.adcionaEspecialista("elemento 3");
		
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());

	}
}
