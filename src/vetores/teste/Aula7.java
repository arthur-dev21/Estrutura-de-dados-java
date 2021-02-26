package vetores.teste;

import vetores.Vetor;

public class Aula7 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adcionaEspecialista("elemento 1");
		vetor.adcionaEspecialista("elemento 2");
		vetor.adcionaEspecialista("elemento 3");
		vetor.adcionaEspecialista("elemento 4");
		
		vetor.adcionaQualquerPosicao(3, "elemento novo 1");
		
		
		System.out.println(vetor.toString());
		
		System.out.println(vetor.tamanho());
	}

}
