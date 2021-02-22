package vetores;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void adcionaSenior(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("vetor esta cheio , nao � possivel adcionar elementos");
		}
	}

	/*
	 * no modelo pleno vai dar erro caso queiramos adcionar elementos acima da
	 * capaidade
	 * 
	 */

	public void adcionaPleno(String elemento) { // adciona um elemento no vetor
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}

	/*
	 * funciona , beleza mas temos somente 5 posi�oes , mas caso tivessimos 10 mil
	 * posi�oes ?ou 1 milhao de posi�oes em sistemas grandes?
	 */

	public void adcionaJunior(String elemento) { // adciona um elemento no vetor
		for (int i = 0; i < this.elementos.length; i++) { // pecorre o array
			if (this.elementos[i] == null) { // verifica a posi�ao vazia
				this.elementos[i] = elemento; // adciona p elemento a posi�ao vazia
				break; // para o loop
			}
		}
	}

}
