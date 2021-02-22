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
			throw new Exception("vetor esta cheio , nao é possivel adcionar elementos");
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
	 * funciona , beleza mas temos somente 5 posiçoes , mas caso tivessimos 10 mil
	 * posiçoes ?ou 1 milhao de posiçoes em sistemas grandes?
	 */

	public void adcionaJunior(String elemento) { // adciona um elemento no vetor
		for (int i = 0; i < this.elementos.length; i++) { // pecorre o array
			if (this.elementos[i] == null) { // verifica a posiçao vazia
				this.elementos[i] = elemento; // adciona p elemento a posiçao vazia
				break; // para o loop
			}
		}
	}

}
